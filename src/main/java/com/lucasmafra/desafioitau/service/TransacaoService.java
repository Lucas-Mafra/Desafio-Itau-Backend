package com.lucasmafra.desafioitau.service;

import java.time.OffsetDateTime;
import java.util.DoubleSummaryStatistics;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.springframework.stereotype.Service;

import com.lucasmafra.desafioitau.model.Transacao;

@Service
public class TransacaoService {
    
    private final Queue<Transacao> transacoes = new ConcurrentLinkedQueue<>();

    public void adicionarTransacao(Transacao transacao) {
        transacoes.add(transacao);
    }

    public void limparTransacoes() {
        transacoes.clear();
    }

    public DoubleSummaryStatistics obterEstatisticas() {
        OffsetDateTime agora = OffsetDateTime.now();
        return transacoes.stream().filter(t -> t.getDataHora().isAfter(agora.minusMinutes(1)))
                .mapToDouble(Transacao::getValor)
                .summaryStatistics();
    }

}
