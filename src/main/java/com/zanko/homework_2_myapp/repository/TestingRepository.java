package com.zanko.homework_2_myapp.repository;

import com.zanko.homework_2_myapp.entity.Testing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TestingRepository extends JpaRepository<Testing, UUID> {
}
