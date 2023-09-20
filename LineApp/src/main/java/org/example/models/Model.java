package org.example.models;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;

@MappedSuperclass
public class Model implements Serializable {
    @Serial
    private static final long serialVersionUID = 4453227469329298005L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    public Model(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
