package com.fernando.mathapi.services.interfaces;

import java.util.Optional;

import com.fernando.mathapi.dtos.FactorialDTO;

public interface FactorialService {
    FactorialDTO getFactorial(Optional<Long> number);   
}