package com.zanko.petApp.service;

import com.zanko.petApp.entity.Unit;
import com.zanko.petApp.repository.UnitRepository;
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
