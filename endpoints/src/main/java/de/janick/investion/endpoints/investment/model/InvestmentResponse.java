package de.janick.investion.endpoints.investment.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class InvestmentResponse {
    private Long id;
    private String isin;
    private String wkn;
    private String symbol;
    private String unternehmen;
    private INVESTMENTTYP investmenttyp;
}
