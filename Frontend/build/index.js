const API_URL = 'http://localhost:8080/api';
const todoList = document.getElementById('todoList');
const newItem = document.getElementById('newItem');


async function fetchTodos() {
    const response = await fetch(`${API_URL}/getTodos`);
    const todos = await response.json();
    todoList.innerHTML = '';
    todos.forEach(todo => {
        const li = document.createElement('li');
        li.textContent = todo.text;
        const deleteButton = document.createElement('button');
        deleteButton.textContent = 'X';
        deleteButton.onclick = () => deleteItem(todo.id);

        li.classList.add('text-center');

        deleteButton.classList.add('border');    

        li.appendChild(deleteButton);
        todoList.appendChild(li);
    });
}

async function deleteItem(id) {
    const response = await fetch(`${API_URL}/removeTodo/${id}`, {
        method: 'DELETE',
    });
    if (response.ok) {
        fetchTodos();
    }
}

async function addTodo() {
    if (newItem.value.trim() !== '') {
        const response = await fetch(`${API_URL}/addTodo`, {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json',
            },
            body: JSON.stringify({ text: newItem.value }),
        });
        if (response.ok) {
            newItem.value = '';
            fetchTodos();
        }
    }
}

async function initialize() {
    fetchTodos();
}