package com.zanko.homework_2_myapp.dto;

import com.zanko.homework_2_myapp.entity.Role;
import com.zanko.homework_2_myapp.entity.Testing;
import com.zanko.homework_2_myapp.entity.Unit;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.Set;
import java.util.UUID;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
public class UserDto {

    UUID id;
    String username;
    String surname;
    String email;
    String password;
    String login;
    Set<Role> roles;
    Set<Unit> units;
    Set<Testing> testing;
}
