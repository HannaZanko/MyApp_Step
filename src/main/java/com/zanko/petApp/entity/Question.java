package com.zanko.petApp.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@FieldDefaults(level = AccessLevel.PRIVATE)

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "questions")
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
