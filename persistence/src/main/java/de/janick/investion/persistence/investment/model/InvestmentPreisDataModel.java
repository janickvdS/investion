package de.janick.investion.persistence.investment.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "investment_preis")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class InvestmentPreisDataModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate datum;
    private WAEHRUNG waehrung;
    private BigDecimal preis;

    @ManyToOne
    private InvestmentDataModel investment;
}
