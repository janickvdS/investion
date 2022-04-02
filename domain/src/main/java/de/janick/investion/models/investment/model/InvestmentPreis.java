package de.janick.investion.models.investment.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class InvestmentPreis {
    private Long id;
    private LocalDate datum;
    private WAEHRUNG waehrung;
    private BigDecimal preis;

    private Investment investment;
}
