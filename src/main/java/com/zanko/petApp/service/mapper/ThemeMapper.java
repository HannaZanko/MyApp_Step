package com.zanko.petApp.service.mapper;

import com.zanko.petApp.dto.ThemeDto;
import com.zanko.petApp.entity.Theme;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ThemeMapper implements EntityToDTOMapper<Theme, ThemeDto> {

    ModelMapper modelMapper = new ModelMapper();

    @Override
    public ThemeDto toDTO(Theme entity, Object... args) {
        return modelMapper.map(entity, ThemeDto.class);
    }

    @Override
    public Theme toEntity(ThemeDto dto, Object... args) {
        return modelMapper.map(dto, Theme.class);
    }
}
