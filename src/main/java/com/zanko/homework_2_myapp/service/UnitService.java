package com.zanko.homework_2_myapp.service;

import com.zanko.homework_2_myapp.entity.Unit;
import com.zanko.homework_2_myapp.repository.UnitRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UnitService {

    private final UnitRepository unitRepository;

    public Optional<Unit> findById(UUID id) {
        return unitRepository.findById(id);
    }

}
