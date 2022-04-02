package de.janick.investion.domain.models.investment.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Investment {
    private Long id;
    private String isin;
    private String wkn;
    private String symbol;
    private String unternehmen;
    private INVESTMENTTYP investmenttyp;
}
