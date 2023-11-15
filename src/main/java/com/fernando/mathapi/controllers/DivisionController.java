package com.fernando.mathapi.controllers;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.fernando.mathapi.services.interfaces.DivisionService;

@RestController
@RequestMapping("/division")
public class DivisionController {
    @Autowired
    private DivisionService divisionService;

    @GetMapping
    public ResponseEntity<?> division(
        @RequestParam(value = "numberOne", required = false) Optional<Long> numberOneOptional,
        @RequestParam(value = "numberTwo", required = false) Optional<Long> numberTwoOptional) {
            return ResponseEntity.ok().body(divisionService.division(numberOneOptional, numberTwoOptional));
        }
    
}
