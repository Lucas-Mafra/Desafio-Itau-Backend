package com.lucasmafra.desafioitau.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;

@Getter
public class TransacaoDTO {
    
    @NotNull
    @Min(0)
    private double valor;
    
    @NotNull
    private String dataHora;


}
