package com.fernando.mathapi.controllers.documentation;

import java.util.Optional;
import org.springframework.http.ResponseEntity;
import com.fernando.mathapi.dtos.FactorialDTO;
import com.fernando.mathapi.dtos.ResponseError;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Factorial operation")
public interface FactorialControllerDocumentation {
    @ApiResponses(value = {
            @ApiResponse(
                description = "Calculate number factorial",
                responseCode = "200",
                content = {
                    @Content(
                        mediaType = "application/json",
                        schema = @Schema(
                            allOf = FactorialDTO.class
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
    ResponseEntity<FactorialDTO> factorial(Optional<Long> numberOptional);
}