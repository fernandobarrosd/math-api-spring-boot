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

@Tag(name = "Multiply operation")
public interface MultiplyControllerDocumentation {
    @ApiResponses(value = {
            @ApiResponse(
                description = "Multiply two numbers",
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
    ResponseEntity<ResultDTO> multiply(Optional<Long> numberOneOptional, Optional<Long> numberTwoOptional);
}