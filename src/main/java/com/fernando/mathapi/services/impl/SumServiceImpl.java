package com.fernando.mathapi.services.impl;

import java.util.Optional;
import org.springframework.stereotype.Service;
import com.fernando.mathapi.dtos.ResultDTO;
import com.fernando.mathapi.services.interfaces.SumService;

@Service
public class SumServiceImpl implements SumService {
    @Override
    public ResultDTO sum(Optional<Long> numberOneOptional, Optional<Long> numberTwOptional) {
        Long numberOne = numberOneOptional.orElse(0L);
        Long numberTwo = numberTwOptional.orElse(0L);
        Long sum = numberOne + numberTwo;
        return new ResultDTO(numberOne, numberTwo, sum);
    }
    
}