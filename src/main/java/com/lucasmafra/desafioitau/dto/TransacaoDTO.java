package com.lucasmafra.desafioitau.dto;

import java.time.OffsetDateTime;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;

@Getter
public class TransacaoDTO {
    
    private double valor;
    
    
    private OffsetDateTime dataHora;


}
