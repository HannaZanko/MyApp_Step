package com.zanko.homework_2_myapp.entity;


import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Test extends AbstractEntity {

    @JoinColumn
    @ManyToOne
    private Unit unit;

}
