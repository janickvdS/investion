package de.janick.investion.domain.models.investment.service;

import java.util.List;

import de.janick.investion.domain.api.InvestmentPreisService;
import de.janick.investion.domain.models.investment.model.InvestmentPreis;
import de.janick.investion.domain.spi.InvestmentPreisPersistenceService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class InvestmentPreisServiceImpl implements InvestmentPreisService {

    private final InvestmentPreisPersistenceService investmentPersistenceService;

    @Override
    public List<InvestmentPreis> findAll() {
        return investmentPersistenceService.findAll();
    }

    @Override
    public InvestmentPreis getById(Long id) {
        return investmentPersistenceService.getById(id);
    }

    @Override
    public InvestmentPreis create(InvestmentPreis investment) {
        return investmentPersistenceService.create(investment);
    }

    @Override
    public InvestmentPreis update(InvestmentPreis investment) {
        return investmentPersistenceService.update(investment);
    }

    @Override
    public void delete(Long id) {
        investmentPersistenceService.delete(id);
    }
}
