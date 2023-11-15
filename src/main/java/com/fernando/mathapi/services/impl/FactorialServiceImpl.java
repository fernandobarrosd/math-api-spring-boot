package com.fernando.mathapi.services.impl;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.fernando.mathapi.dtos.FactorialDTO;
import com.fernando.mathapi.services.interfaces.FactorialService;

@Service
public class FactorialServiceImpl implements FactorialService {

    @Override
    public FactorialDTO getFactorial(Optional<Long> number) {
        Long numberLong = number.orElse(0L);
        Long factorial = numberLong;

        for (int i = numberLong.intValue() - 1; i > 0; i --) {
            factorial *= i;
        }
        return new FactorialDTO(numberLong, factorial);
    }
    
}