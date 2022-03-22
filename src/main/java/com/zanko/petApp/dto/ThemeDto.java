package com.zanko.petApp.dto;

import com.zanko.petApp.entity.Unit;
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
