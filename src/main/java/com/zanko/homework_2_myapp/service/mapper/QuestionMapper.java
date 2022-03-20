package com.zanko.homework_2_myapp.service.mapper;

import com.zanko.homework_2_myapp.dto.QuestionDto;
import com.zanko.homework_2_myapp.entity.Question;
import com.zanko.homework_2_myapp.service.QuestionService;
import com.zanko.homework_2_myapp.service.mapper.EntityToDTOMapper;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)

@Component
public class QuestionMapper implements EntityToDTOMapper<Question, QuestionDto> {

    ModelMapper modelMapper = new ModelMapper();

//    QuestionService questionService;

    public QuestionMapper(QuestionService questionService) {
        super();
//        this.questionService = questionService;
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
