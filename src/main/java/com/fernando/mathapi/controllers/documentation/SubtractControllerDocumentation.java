package com.fernando.mathapi.controllers.documentation;

import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.fernando.mathapi.dtos.ResponseError;
import com.fernando.mathapi.dtos.ResultDTO;

import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Subtract operation")
public interface SubtractControllerDocumentation {
    @ApiResponses(value = {
            @ApiResponse(
                description = "Subtract two numbers",
                responseCode = "200",
                content = {
                    @Content(
                        mediaType = "application/json",
                        schema = @Schema(
                            allOf = ResultDTO.class
                        )
                    )
                }
            ),
            @ApiResponse(
                description = "Conversion error",
                responseCode = "401",
                content = {
                    @Content(
                        mediaType = "application/json",
                        schema = @Schema(
                            allOf = ResponseError.class
                        )
                    )
                }
            )
        }
    )
    ResponseEntity<ResultDTO> subtract(Optional<Long> numberOneOptional, Optional<Long> numberTwoOptional);
}