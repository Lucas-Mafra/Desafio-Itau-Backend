package com.lucasmafra.desafioitau.controller;

import java.time.OffsetDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lucasmafra.desafioitau.dto.TransacaoDTO;
import com.lucasmafra.desafioitau.model.Transacao;
import com.lucasmafra.desafioitau.service.TransacaoService;

import jakarta.validation.Valid;


@RestController
@RequestMapping("/transacao")
public class TransacaoController {
    
    private final TransacaoService transacaoService;

    public TransacaoController(TransacaoService transacaoService) {
        this.transacaoService = transacaoService;
    }

    @PostMapping
    public ResponseEntity<Void> criarTransacao(@Valid @RequestBody TransacaoDTO transacaoDTO) {        
        
        if(transacaoDTO.getDataHora().isAfter(OffsetDateTime.now()) || transacaoDTO.getValor() <= 0) {
            return ResponseEntity.unprocessableEntity().build();
        }

        transacaoService.adicionarTransacao(new Transacao(transacaoDTO.getValor(), transacaoDTO.getDataHora()));

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @DeleteMapping
    public ResponseEntity<Void> limparTransacoes() {
        transacaoService.limparTransacoes();
        return ResponseEntity.ok().build();
    }
    

}