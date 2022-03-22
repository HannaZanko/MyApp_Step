package com.zanko.petApp.dto;

import com.zanko.petApp.entity.Unit;
import com.zanko.petApp.entity.User;
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
