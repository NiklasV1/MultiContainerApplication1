package org.niklasv1.app.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "todos")
public class Todo {

    @Id
    @GeneratedValue
    public UUID id;

    @Column(nullable = false, length = 2000)
    public String text;

    public Todo() {
    }

    public Todo(String text) {
        this.text = text;
    }
}
