package com.fernando.mathapi.services.impl;

import java.util.Optional;
import org.springframework.stereotype.Service;
import com.fernando.mathapi.dtos.DeltaResultDTO;
import com.fernando.mathapi.exceptions.NegativeDeltaException;
import com.fernando.mathapi.services.interfaces.DeltaService;

@Service
public class DeltaServiceImpl implements DeltaService {

    @Override
    public DeltaResultDTO delta(
        Optional<Long> a, 
        Optional<Long> b,
        Optional<Long> c) {
        Long numberOne = a.orElse(0L);
        Long numberTwo = b.orElse(0L);
        Long numberThree = c.orElse(0L);

        Long delta = (numberTwo * numberTwo) - (4 * numberOne * numberThree);
        if (delta < 0) {
            throw new NegativeDeltaException("Delta value is negative", numberOne, numberTwo, numberThree, delta);
        }
        return new DeltaResultDTO(numberOne, numberTwo, numberThree, delta);
    }
    
}