package com.fernando.mathapi.services.interfaces;

import java.util.Optional;

import com.fernando.mathapi.dtos.DeltaResultDTO;

public interface DeltaService {
    DeltaResultDTO delta(
        Optional<Long> a, 
        Optional<Long> b,
        Optional<Long> c);
}
