package com.crudlover.api.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;

public record CarDTO(

    @NotBlank
    String modelo, 

    @NotBlank
    String fabricante, 

    @Past
    String dataFabricacao,

    @NotBlank
    double valor, 

    @NotBlank
    int anoModelo) {
    
}
