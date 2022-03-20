package com.zanko.homework_2_myapp.dto;

import com.zanko.homework_2_myapp.entity.Unit;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.UUID;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
public class ThemeDto {

    UUID id;
    String name;
    String body;
    Unit unit;
}
