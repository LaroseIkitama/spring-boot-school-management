package com.ikitama.management_of_schools.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class EntityNotFoundException extends RuntimeException {
    String message;
}
