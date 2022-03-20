package com.zanko.homework_2_myapp.service;

import com.zanko.homework_2_myapp.entity.Question;
import com.zanko.homework_2_myapp.repository.QuestionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class QuestionService {

    private final QuestionRepository questionRepository;

    public Optional<Question> findById(UUID id) {
        return questionRepository.findById(id);
    }

    public List<Question> getAll() {
        return questionRepository.findAll();
    }

}
