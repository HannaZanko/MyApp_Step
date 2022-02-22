package com.zanko.homework_2_myapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class User extends AbstractEntity {


    @Column(name = "u_name")
    private String username;

    @Column(name = "u_surname")
    private String surname;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "login")
    private String login;

    @JoinColumn
    @OneToMany
    private Set<Test> tests;

}
