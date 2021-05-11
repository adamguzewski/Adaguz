package pl.pjatk.adaguz.lab4.advice;

import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice

public class Lab4advice {

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<String> handleRuntimeException(RuntimeException exception){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body("Exception occured: " + exception.getLocalizedMessage());
    }
}
