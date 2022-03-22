package com.zanko.petApp.dto;

import com.zanko.petApp.entity.Unit;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.UUID;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
public class QuestionDto {

    UUID id;
    String body;
    String answer;
    Integer score;
    Unit unit;
}
