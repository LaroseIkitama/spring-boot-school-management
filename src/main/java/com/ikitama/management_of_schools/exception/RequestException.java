package com.ikitama.management_of_schools.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class RequestException extends RuntimeException{
    String message;
    HttpStatus httpStatus;
}
