package com.zanko.homework_2_myapp.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "themes")
public class Theme extends AbstractEntity {

    @Column(name = "theme_name")
    private String name;

    @Column
    private String body;

    @JoinColumn(name = "unit_id")
    @ManyToOne
    private Unit unit;

}
