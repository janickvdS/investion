package de.janick.investion.models.investment.service;

import java.util.List;

import de.janick.investion.api.InvestmentService;
import de.janick.investion.models.investment.model.Investment;
import de.janick.investion.spi.InvestmentPersistenceService;
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
}
