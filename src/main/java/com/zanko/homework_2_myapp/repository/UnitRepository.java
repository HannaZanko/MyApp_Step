package com.zanko.homework_2_myapp.repository;

import com.zanko.homework_2_myapp.entity.Unit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UnitRepository extends JpaRepository<Unit, UUID> {
}
