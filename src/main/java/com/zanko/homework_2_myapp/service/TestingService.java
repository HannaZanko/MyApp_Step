package com.zanko.homework_2_myapp.service;

import com.zanko.homework_2_myapp.entity.Testing;
import com.zanko.homework_2_myapp.repository.RoleRepository;
import com.zanko.homework_2_myapp.repository.TestingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class TestingService {

    private final TestingRepository testingRepository;

    public Optional<Testing> findById(UUID id) {
        return testingRepository.findById(id);
    }

    public List<Testing> getAll() {
        return testingRepository.findAll();
    }
}
