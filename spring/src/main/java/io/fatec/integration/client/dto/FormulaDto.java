package io.fatec.integration.client.dto;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public record FormulaDto(
        @JsonProperty("driver_number")
        Integer driverNumber,
        @JsonProperty("team_name")
        String teamName,
        @JsonProperty("last_name")
        String lastName
) {
}