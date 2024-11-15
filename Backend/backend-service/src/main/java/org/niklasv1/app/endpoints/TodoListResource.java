package org.niklasv1.app.endpoints;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import org.niklasv1.app.logic.TodoManager;
import org.niklasv1.app.model.Todo;

import java.util.List;
import java.util.UUID;

@Path("/api")
@ApplicationScoped
public class TodoListResource {

    @Inject
    TodoManager todoManager;

    @GET
    @Path("/getTodo/{id}")
    public Todo getTodo(UUID id) {
        return todoManager.getTodo(id);
    }

    @GET
    @Path("/getTodos")
    public List<Todo> getTodos() {
        return todoManager.getTodos();
    }

    @POST
    @Path("/addTodo")
    public UUID addTodo(Todo todo) {
        return todoManager.addTodo(todo.text);
    }

    @DELETE
    @Path("/removeTodo/{id}")
    public boolean removeTodo(UUID id) {
        return todoManager.removeTodo(id);
    }

}
