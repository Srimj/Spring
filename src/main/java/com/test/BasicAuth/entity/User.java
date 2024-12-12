package com.test.BasicAuth.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;


@Entity
@Data
@Table(name = "user", schema = "lil")
public class User {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "password")
    private String password;
}
