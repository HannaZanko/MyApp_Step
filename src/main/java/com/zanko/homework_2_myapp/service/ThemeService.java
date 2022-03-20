package com.zanko.homework_2_myapp.service;

import com.zanko.homework_2_myapp.entity.Theme;
import com.zanko.homework_2_myapp.repository.ThemeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ThemeService {

    private final ThemeRepository themeRepository;

    public Optional<Theme> findById(UUID id) {
        return themeRepository.findById(id);
    }

    public List<Theme> getAll() {
        return themeRepository.findAll();
    }

}
