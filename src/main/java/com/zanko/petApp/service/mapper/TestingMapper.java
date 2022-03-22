package com.zanko.petApp.service.mapper;

import com.zanko.petApp.dto.TestingDto;
import com.zanko.petApp.entity.Testing;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TestingMapper implements EntityToDTOMapper<Testing, TestingDto>{

    ModelMapper modelMapper = new ModelMapper();

    @Override
    public TestingDto toDTO(Testing entity, Object... args) {
        return modelMapper.map(entity, TestingDto.class);
    }

    @Override
    public Testing toEntity(TestingDto dto, Object... args) {
        return modelMapper.map(dto, Testing.class);
    }
}
