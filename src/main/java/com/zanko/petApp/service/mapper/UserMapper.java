package com.zanko.petApp.service.mapper;

import com.zanko.petApp.dto.UserDto;
import com.zanko.petApp.entity.User;
import org.modelmapper.ModelMapper;

public class UserMapper implements EntityToDTOMapper<User, UserDto> {

    private ModelMapper modelMapper;

    @Override
    public UserDto toDTO(User entity, Object... args) {
        return modelMapper.map(entity, UserDto.class);
    }

    @Override
    public User toEntity(UserDto dto, Object... args) {
        return modelMapper.map(dto, User.class);
    }
}
