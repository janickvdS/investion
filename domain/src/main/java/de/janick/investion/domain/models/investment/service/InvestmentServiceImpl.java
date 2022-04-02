package de.janick.investion.domain.models.investment.service;

import java.util.List;

import de.janick.investion.domain.api.InvestmentService;
import de.janick.investion.domain.models.investment.model.Investment;
import de.janick.investion.domain.spi.InvestmentPersistenceService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class InvestmentServiceImpl implements InvestmentService {

    private final InvestmentPersistenceService investmentPersistenceService;

    @Override
    public List<Investment> findAll() {
        return investmentPersistenceService.findAll();
    }

    @Override
    public Investment getById(Long id) {
        return investmentPersistenceService.getById(id);
    }

    @Override
    public Investment create(Investment investment) {
        return investmentPersistenceService.create(investment);
    }

    @Override
    public Investment update(Investment investment) {
        return investmentPersistenceService.update(investment);
    }

    @Override
    public void delete(Long id) {
        investmentPersistenceService.delete(id);
    }
}
