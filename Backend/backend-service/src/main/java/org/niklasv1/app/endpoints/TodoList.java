package org.niklasv1.app.endpoints;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.niklasv1.app.model.Todo;

import java.util.List;

@Path("/api")
public class TodoList {

    @GET
    @Path("/todos")
    public List<Todo> getTodos() {
        return Todo.listAll();
    }


}
