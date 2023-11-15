package com.fernando.mathapi.services.interfaces;

import java.util.Optional;
import com.fernando.mathapi.dtos.ResultDTO;

public interface SubtractService {
    ResultDTO subtract(Optional<Long> numberOneOptional, Optional<Long> numberTwOptional);
}
