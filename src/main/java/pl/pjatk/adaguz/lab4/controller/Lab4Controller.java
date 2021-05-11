package pl.pjatk.adaguz.lab4.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exception")

public class Lab4Controller {
    @GetMapping("/first")
    public ResponseEntity<String> exception(){
        throw new RuntimeException("Testing RestControllerAdvice");
    }

}
