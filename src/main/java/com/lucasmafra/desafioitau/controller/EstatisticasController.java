package com.lucasmafra.desafioitau.controller;
import org.springframework.web.bind.annotation.RestController;

import com.lucasmafra.desafioitau.dto.EstatisticasDTO;
import com.lucasmafra.desafioitau.service.TransacaoService;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.DoubleSummaryStatistics;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/estatistica")
public class EstatisticasController {
    
    private final TransacaoService transacaoService;

    public EstatisticasController(TransacaoService transacaoService) {
        this.transacaoService = transacaoService;
    }

    @GetMapping     
    public ResponseEntity<EstatisticasDTO> obterEstatisticas () {
        DoubleSummaryStatistics estatisticas = transacaoService.obterEstatisticas();

        return ResponseEntity.ok(new EstatisticasDTO(estatisticas));
    }
    
}
