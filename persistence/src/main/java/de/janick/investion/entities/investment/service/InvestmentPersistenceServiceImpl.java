package de.janick.investion.entities.investment.service;

import java.util.List;

import de.janick.investion.entities.investment.mapper.InvestmentPersistenceMapper;
import de.janick.investion.entities.investment.model.InvestmentDataModel;
import de.janick.investion.entities.investment.repository.InvestmentRepository;
import de.janick.investion.models.investment.model.Investment;
import de.janick.investion.spi.InvestmentPersistenceService;
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
}
