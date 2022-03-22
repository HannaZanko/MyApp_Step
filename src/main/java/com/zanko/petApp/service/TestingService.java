package com.zanko.petApp.service;

import com.zanko.petApp.entity.Testing;
import com.zanko.petApp.repository.TestingRepository;
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
