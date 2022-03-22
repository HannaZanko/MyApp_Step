package com.zanko.petApp.dto;

import com.zanko.petApp.entity.Role;
import com.zanko.petApp.entity.Testing;
import com.zanko.petApp.entity.Unit;
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
