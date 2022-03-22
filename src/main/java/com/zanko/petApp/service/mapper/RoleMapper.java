package com.zanko.petApp.service.mapper;

import com.zanko.petApp.dto.RoleDto;
import com.zanko.petApp.entity.Role;
import com.zanko.petApp.service.RoleService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class RoleMapper implements EntityToDTOMapper<Role, RoleDto> {

    ModelMapper modelMapper = new ModelMapper();

    public RoleMapper(RoleService roleService) {
        super();
    }

    @Override
    public RoleDto toDTO(Role entity, Object... args) {
        return modelMapper.map(entity, RoleDto.class);
    }

    @Override
    public Role toEntity(RoleDto dto, Object... args) {
        return modelMapper.map(dto, Role.class);
    }
}
