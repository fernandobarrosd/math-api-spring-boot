package com.fernando.mathapi.dtos;

import lombok.Getter;
import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@Getter
public class ResultDTO {
    private final Long numberOne;
    private final Long numberTwo;
    private final Long result;   
}