package com.zanko.homework_2_myapp.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@FieldDefaults(level = AccessLevel.PRIVATE)

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Question extends AbstractEntity {

    @Column(name = "body")
    String body;

    @Column(name = "answer")
    String answer;

    @Column(name = "score")
    Integer score;

    @ManyToOne
    @JoinColumn(name = "unit_id")
    Unit unit;
}
