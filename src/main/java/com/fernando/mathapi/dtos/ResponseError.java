package com.fernando.mathapi.dtos;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class ResponseError {
    private final String message;
    private final boolean error;
    private final String path;
    private final Integer statusCode;
}