package com.zanko.homework_2_myapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class Unit extends AbstractEntity {

    @Column(name = "unit_name")
    private String name;

    @OneToMany(mappedBy = "unit")
    private Set<Theme> theme;

    @OneToMany(mappedBy = "unit")
    private Set<Test> test;
}
