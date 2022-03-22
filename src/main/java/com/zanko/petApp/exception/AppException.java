package com.zanko.petApp.exception;


import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@Data
public class AppException {

    LocalDateTime timestamp;

    Integer status;

    String error;

    String message;

    public AppException(Integer status, String error, String message) {
        this.timestamp = LocalDateTime.now();
        this.status = status;
        this.error = error;
        this.message = message;
    }
}
