package com.zanko.homework_2_myapp.dto;

import com.zanko.homework_2_myapp.entity.Question;
import com.zanko.homework_2_myapp.entity.Testing;
import com.zanko.homework_2_myapp.entity.Theme;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.Set;
import java.util.UUID;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
public class UnitDto {

    UUID id;
    String name;
    Set<Theme> theme;
    Set<Question> questions;
    Set<Testing> testing;
}
