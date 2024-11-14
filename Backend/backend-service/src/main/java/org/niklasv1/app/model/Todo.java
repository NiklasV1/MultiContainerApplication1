package org.niklasv1.app.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "todos")
public class Todo extends PanacheEntity {
    public Long id;
    @Column(nullable = false, length = 2000)
    public String text;
}
