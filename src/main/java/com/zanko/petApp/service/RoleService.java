package com.zanko.petApp.service;

import com.zanko.petApp.entity.Role;
import com.zanko.petApp.repository.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class RoleService {

    private final RoleRepository roleRepository;

    public Optional<Role> findById(UUID id) {
        return roleRepository.findById(id);
    }

    public List<Role> getAll() {
        return roleRepository.findAll();
    }
}
