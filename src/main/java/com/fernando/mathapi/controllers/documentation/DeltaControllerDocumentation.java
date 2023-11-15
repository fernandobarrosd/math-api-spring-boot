package com.fernando.mathapi.controllers.documentation;

import java.util.Optional;
import org.springframework.http.ResponseEntity;
import com.fernando.mathapi.dtos.DeltaResponseError;
import com.fernando.mathapi.dtos.DeltaResultDTO;
import com.fernando.mathapi.dtos.ResponseError;
import com.fernando.mathapi.dtos.ResultDTO;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Delta operation")
public interface DeltaControllerDocumentation {
    @ApiResponses(value = {
            @ApiResponse(
                description = "Calculate delta",
                responseCode = "200",
                content = {
                    @Content(
                        mediaType = "application/json",
                        schema = @Schema(
                            allOf = DeltaResultDTO.class
                        )
                    )
                }
            ),
            @ApiResponse(
                description = "Delta negative error",
                responseCode = "401",
                content = {
                    @Content(
                        mediaType = "application/json",
                        schema = @Schema(
                            allOf = DeltaResponseError.class
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
    ResponseEntity<ResultDTO> delta(
        Optional<Long> numberOneOptional,
        Optional<Long> numberTwoOptional,
        Optional<Long> numberThreeOptional
    );
}