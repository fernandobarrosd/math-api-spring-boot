package com.fernando.mathapi.dtos;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class FactorialDTO {
    private final Long number;
    private final Long result;   
}