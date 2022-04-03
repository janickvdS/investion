package de.janick.investion.domain.api;

import java.util.List;

import de.janick.investion.domain.models.investment.model.InvestmentPreis;

public interface InvestmentPreisService {
    List<InvestmentPreis> findAll();

    InvestmentPreis getById(Long id);

    InvestmentPreis create(InvestmentPreis investment);

    InvestmentPreis update(InvestmentPreis investment);

    void delete(Long id);

}
