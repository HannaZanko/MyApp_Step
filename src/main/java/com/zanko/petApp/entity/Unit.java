package com.zanko.petApp.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "units")
public class Unit extends AbstractEntity {

    @Column(name = "unit_name")
    private String name;

    @OneToMany(mappedBy = "unit")
    private Set<Theme> theme;

    @OneToMany(mappedBy = "unit")
    private Set<Question> questions;

    @OneToMany(mappedBy = "unit")
    private Set<Testing> testing;
}
