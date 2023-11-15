package com.fernando.mathapi.controllers;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.fernando.mathapi.controllers.documentation.DeltaControllerDocumentation;
import com.fernando.mathapi.dtos.ResultDTO;
import com.fernando.mathapi.services.interfaces.DeltaService;

@RestController
@RequestMapping("/delta")
public class DeltaController implements DeltaControllerDocumentation {
    @Autowired
    private DeltaService deltaService;

    @GetMapping
    public ResponseEntity<ResultDTO> delta(
        @RequestParam(value = "numberOne", required = false) Optional<Long> numberOneOptional,
        @RequestParam(value = "numberTwo", required = false) Optional<Long> numberTwoOptional,
        @RequestParam(value = "numberThree", required = false) Optional<Long> numberThreeOptional) {
            return ResponseEntity.ok().body(deltaService.delta(numberOneOptional, numberTwoOptional, numberThreeOptional));
        }
}