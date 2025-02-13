package com.unam.greenwave.model.MetodoEnvio;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
@JsonInclude(JsonInclude.Include.NON_NULL)
public record ActualizarMetodoDeEnvioDto(
        String nombre,

        TipoEnvio tipoEnvio,
        String tiempoEstimado,

        Double costo

) {
}
