package com.lucasmafra.desafioitau.dto;

import java.util.DoubleSummaryStatistics;

import lombok.Getter;

@Getter
public class EstatisticasDTO {
    private final long count;
    private final double sum;
    private final double avg;
    private final double min;
    private final double max;

    public EstatisticasDTO(DoubleSummaryStatistics stats) {
        this.count = stats.getCount();
        this.sum = stats.getSum();
        this.avg = stats.getAverage();
        this.min = stats.getMin();
        this.max = stats.getMax();
    }
}
