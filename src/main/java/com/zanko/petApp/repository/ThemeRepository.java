package com.zanko.petApp.repository;

import com.zanko.petApp.entity.Theme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface ThemeRepository extends JpaRepository<Theme, UUID> {
}
