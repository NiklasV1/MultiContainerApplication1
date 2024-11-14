package org.niklasv1.app.endpoints;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.niklasv1.app.model.Todo;

import java.util.List;

@Path("/test")
public class Endpoint {

    @GET
    public String hello() {
        return "Hello";
    }

    @GET
    @Path("/2/{name}")
    public String hello2(String name) {
        return "hello " + name;
    }

    @GET
    @Path("/database/content")
    public String databaseTest() {
        StringBuilder returnString = new StringBuilder();
        List<Todo> todos = Todo.listAll();
        for (Todo todo : todos) {
            returnString.append(todo.text.strip()).append("\n");
        }
        return returnString.toString();
    }




}
