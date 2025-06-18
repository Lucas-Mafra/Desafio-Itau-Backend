package com.lucasmafra.desafioitau.model;

import java.time.OffsetDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Transacao {

    private double valor;
    private OffsetDateTime dataHora;
    
}
