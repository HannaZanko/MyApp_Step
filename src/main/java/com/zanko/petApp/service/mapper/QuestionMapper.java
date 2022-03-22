package com.zanko.petApp.service.mapper;

import com.zanko.petApp.dto.QuestionDto;
import com.zanko.petApp.entity.Question;
import com.zanko.petApp.service.QuestionService;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)

@Component
public class QuestionMapper implements EntityToDTOMapper<Question, QuestionDto> {

    ModelMapper modelMapper;

//    QuestionService questionService;

    public QuestionMapper(QuestionService questionService, ModelMapper modelMapper) {
        super();
//        this.questionService = questionService;
        this.modelMapper = modelMapper;
    }

    @Override
    public QuestionDto toDTO(Question entity, Object... args) {
        return modelMapper.map(entity, QuestionDto.class);
    }

    @Override
    public Question toEntity(QuestionDto dto, Object... args) {
        return modelMapper.map(dto, Question.class);
    }
}
