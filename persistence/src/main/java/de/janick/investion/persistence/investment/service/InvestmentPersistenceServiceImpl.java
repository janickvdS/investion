package de.janick.investion.persistence.investment.service;

import java.util.List;

import de.janick.investion.domain.models.investment.model.Investment;
import de.janick.investion.domain.spi.InvestmentPersistenceService;
import de.janick.investion.persistence.investment.mapper.InvestmentPersistenceMapper;
import de.janick.investion.persistence.investment.model.InvestmentDataModel;
import de.janick.investion.persistence.investment.repository.InvestmentRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class InvestmentPersistenceServiceImpl implements InvestmentPersistenceService {

    private final InvestmentRepository investmentRepository;
    private final InvestmentPersistenceMapper investmentMapper;

    @Override
    public List<Investment> findAll() {
        return investmentMapper.mapToDomain(investmentRepository.findAll());
    }

    @Override
    public Investment getById(Long id) {
        InvestmentDataModel model = investmentRepository.findById(id)
                .orElseThrow(() -> new IllegalStateException(String.format("Investment %d nicht gefunden", id)));
        return investmentMapper.mapToDomain(model);
    }

    @Override
    public Investment create(Investment investment) {
        return investmentMapper.mapToDomain(investmentRepository.save(investmentMapper.mapFromDomain(investment)));
    }

    @Override
    public Investment update(Investment investment) {
        if (investment.getId() == null) {
            throw new IllegalStateException(String.format("Investment %d wurde noch nicht angelegt. Bitte create nutzen", investment.getId()));
        }
        return investmentMapper.mapToDomain(investmentRepository.save(investmentMapper.mapFromDomain(investment)));
    }

    @Override
    public void delete(Long id) {
        InvestmentDataModel model = investmentRepository.findById(id)
                .orElseThrow(() -> new IllegalStateException(String.format("Investment %d nicht gefunden", id)));
        investmentRepository.delete(model);
    }
}
