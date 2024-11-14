package org.niklasv1.app.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serializable;

@Entity
@Table(name = "todos")
public class Todo extends PanacheEntity {
    @Id
    private int id;
    @Column(nullable = false, length = 2000)
    private String text;
}
