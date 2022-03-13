package com.zanko.homework_2_myapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Theme extends AbstractEntity {

    @Column(name = "theme_name")
    private String name;

    @Column
    private String body;

    @JoinColumn(name = "unit_id")
    @ManyToOne
    private Unit unit;

}
