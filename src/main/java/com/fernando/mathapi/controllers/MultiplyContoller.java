package com.fernando.mathapi.controllers;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fernando.mathapi.controllers.documentation.MultiplyControllerDocumentation;
import com.fernando.mathapi.dtos.ResultDTO;
import com.fernando.mathapi.services.interfaces.MultiplyService;

@RestController
@RequestMapping("/multiply")
public class MultiplyContoller implements MultiplyControllerDocumentation {
    @Autowired
    private MultiplyService multiplyService;
    
    @GetMapping
    public ResponseEntity<ResultDTO> multiply(
        @RequestParam(value = "numberOne", required = false) Optional<Long> numberOneOptional,
        @RequestParam(value = "numberTwo", required = false) Optional<Long> numberTwoOptional) {
            return ResponseEntity.ok().body(multiplyService.multiply(numberOneOptional, numberTwoOptional));
        }
}