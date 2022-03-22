package com.zanko.petApp.service.mapper;

import com.zanko.petApp.dto.UnitDto;
import com.zanko.petApp.entity.Unit;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UnitMapper implements EntityToDTOMapper<Unit, UnitDto> {

    ModelMapper modelMapper;

    @Override
    public UnitDto toDTO(Unit entity, Object... args) {
        return modelMapper.map(entity, UnitDto.class);
    }

    @Override
    public Unit toEntity(UnitDto dto, Object... args) {
        return modelMapper.map(dto, Unit.class);
    }
}
