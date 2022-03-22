package com.zanko.petApp.dto;

import com.zanko.petApp.entity.Question;
import com.zanko.petApp.entity.Testing;
import com.zanko.petApp.entity.Theme;
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
