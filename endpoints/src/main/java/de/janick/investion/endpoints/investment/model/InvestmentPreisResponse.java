package de.janick.investion.endpoints.investment.model;

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
public class InvestmentPreisResponse {
    private Long id;
    private LocalDate datum;
    private WAEHRUNG waehrung;
    private BigDecimal preis;

    private InvestmentResponse investmentResponse;
}
