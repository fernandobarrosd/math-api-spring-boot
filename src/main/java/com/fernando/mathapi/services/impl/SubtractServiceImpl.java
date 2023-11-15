package com.fernando.mathapi.services.impl;

import java.util.Optional;
import org.springframework.stereotype.Service;
import com.fernando.mathapi.dtos.ResultDTO;
import com.fernando.mathapi.services.interfaces.SubtractService;

@Service
public class SubtractServiceImpl implements SubtractService {
	@Override
	public ResultDTO subtract(Optional<Long> numberOneOptional, Optional<Long> numberTwOptional) {
		Long numberOne = numberOneOptional.orElse(0L);
        Long numberTwo = numberTwOptional.orElse(0L);
        Long subtraction = numberOne - numberTwo;
        return new ResultDTO(numberOne, numberTwo, subtraction);
	}
    
}