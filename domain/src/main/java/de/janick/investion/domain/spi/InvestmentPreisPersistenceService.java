package de.janick.investion.domain.spi;

import java.util.List;

import de.janick.investion.domain.models.investment.model.InvestmentPreis;

public interface InvestmentPreisPersistenceService {
    List<InvestmentPreis> findAll();

    InvestmentPreis getById(Long id);

    InvestmentPreis create(InvestmentPreis investment);

    InvestmentPreis update(InvestmentPreis investment);

    void delete(Long id);

}
