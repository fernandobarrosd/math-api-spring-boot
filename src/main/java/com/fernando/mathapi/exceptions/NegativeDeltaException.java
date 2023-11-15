package com.fernando.mathapi.exceptions;

import lombok.Getter;

@Getter
public class NegativeDeltaException extends RuntimeException {
    private final Long numberOne;
    private final Long numberTwo;
    private final Long numberThree;
    private final Long delta;


    public NegativeDeltaException(String message, Long numberOne, Long numberTwo, Long numberThree, Long delta) {
        super(message);
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
        this.numberThree = numberThree;
        this.delta = delta;
    }
}
