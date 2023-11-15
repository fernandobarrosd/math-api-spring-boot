package com.fernando.mathapi.dtos;

import lombok.Getter;

@Getter
public class DeltaResponseError extends ResponseError {
    private final Long numberOne;
    private final Long numberTwo;
    private final Long numberThree;
    private final Long delta;

    public DeltaResponseError(String message, boolean error, String path, Integer statusCode, Long numberOne,
            Long numberTwo, Long numberThree, Long delta) {
        super(message, error, path, statusCode);
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
        this.numberThree = numberThree;
        this.delta = delta;
    }

    
}