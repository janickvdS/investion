package de.janick.investion.entities.investment.model;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "investment")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class InvestmentDataModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String isin;
    private String wkn;
    private String symbol;
    private String unternehmen;
    private INVESTMENTTYP investmenttyp;

}
