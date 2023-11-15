package com.fernando.mathapi.dtos;

import lombok.Getter;

@Getter
public class DeltaResultDTO extends ResultDTO {
    private final Long numberThree;

    public DeltaResultDTO(Long numberOne, Long numberTwo, Long numberThree, Long result) {
        super(numberOne, numberTwo, result);
        this.numberThree = numberThree;
    }   
}