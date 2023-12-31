package com.fernando.mathapi.controllers;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.fernando.mathapi.controllers.documentation.SumControllerDocumentation;
import com.fernando.mathapi.dtos.ResultDTO;
import com.fernando.mathapi.services.interfaces.SumService;

@RestController
@RequestMapping("/sum")
public class SumController implements SumControllerDocumentation {
    @Autowired
    private SumService sumService;


    @GetMapping
    public ResponseEntity<ResultDTO> sum(
        @RequestParam(value = "numberOne", required = false) Optional<Long> numberOneOptional,
        @RequestParam(value = "numberTwo", required = false) Optional<Long> numberTwoOptional) {
            return ResponseEntity.ok().body(sumService.sum(numberOneOptional, numberTwoOptional));
        }
}