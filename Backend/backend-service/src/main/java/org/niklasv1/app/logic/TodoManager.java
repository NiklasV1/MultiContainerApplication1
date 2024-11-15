package org.niklasv1.app.logic;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.niklasv1.app.model.Todo;
import org.niklasv1.app.model.TodoRepository;

import java.util.List;
import java.util.UUID;

@ApplicationScoped
@Transactional
public class TodoManager {

    @Inject
    TodoRepository todoRepository;

    public Todo getTodo(UUID id) {
        return todoRepository.findById(id);
    }

    public List<Todo> getTodos() {
        return todoRepository.listAll();
    }

    public UUID addTodo(String text) {
        Todo todo = new Todo(text);
        todoRepository.persist(todo);
        return todo.id;
    }

    public boolean removeTodo(UUID id) {
        return todoRepository.deleteById(id);
    }
}
