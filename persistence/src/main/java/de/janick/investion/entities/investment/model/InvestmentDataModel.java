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
    @Column(unique = true, nullable = false)
    private String isin;
    @Column(unique = true, nullable = false)
    private String wkn;
    @Column(unique = true, nullable = false)
    private String symbol;
    private String unternehmen;
    private INVESTMENTTYP investmenttyp;

}
