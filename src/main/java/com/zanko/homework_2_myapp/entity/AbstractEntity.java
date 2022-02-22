package com.zanko.homework_2_myapp.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.UUID;

@MappedSuperclass
@Getter
@Setter
public class AbstractEntity {

    @Id
    private UUID id = UUID.randomUUID();
}
