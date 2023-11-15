package com.fernando.mathapi.controllers;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.fernando.mathapi.controllers.documentation.FactorialControllerDocumentation;
import com.fernando.mathapi.dtos.FactorialDTO;
import com.fernando.mathapi.services.interfaces.FactorialService;

@RestController
@RequestMapping("/factorial")
public class FactorialController implements FactorialControllerDocumentation {
    @Autowired
    private FactorialService factorialService;


    @GetMapping
    public ResponseEntity<FactorialDTO> factorial(
        @RequestParam(value = "number", required = false) Optional<Long> numberOptional) {
            return ResponseEntity.ok().body(factorialService.getFactorial(numberOptional));
        }   
}