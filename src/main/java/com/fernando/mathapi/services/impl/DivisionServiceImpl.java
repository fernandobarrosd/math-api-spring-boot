package com.fernando.mathapi.services.impl;

import java.util.Optional;
import org.springframework.stereotype.Service;
import com.fernando.mathapi.dtos.ResultDTO;
import com.fernando.mathapi.services.interfaces.DivisionService;

@Service
public class DivisionServiceImpl implements DivisionService {

    @Override
    public ResultDTO division(Optional<Long> numberOneOptional, Optional<Long> numberTwOptional) {
        Long numberOne = numberOneOptional.orElse(0L);
        Long numberTwo = numberTwOptional.orElse(0L);
        Long subtraction = numberOne / numberTwo;
        return new ResultDTO(numberOne, numberTwo, subtraction);
    }
    
}
