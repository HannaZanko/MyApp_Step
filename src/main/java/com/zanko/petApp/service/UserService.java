package com.zanko.petApp.service;

import com.zanko.petApp.entity.User;
import com.zanko.petApp.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserService {

    private UserRepository userRepository;

    public Optional<User> findById(UUID id) {
        return userRepository.findById(id);
    }
}
