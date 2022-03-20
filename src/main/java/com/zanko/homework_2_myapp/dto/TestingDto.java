package com.zanko.homework_2_myapp.dto;

import com.zanko.homework_2_myapp.entity.Unit;
import com.zanko.homework_2_myapp.entity.User;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.UUID;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
public class TestingDto {

    UUID id;
    User user;
    Unit unit;
    Integer score;
}
