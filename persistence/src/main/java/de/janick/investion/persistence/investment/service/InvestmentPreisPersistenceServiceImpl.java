package de.janick.investion.persistence.investment.service;

import java.util.List;

import de.janick.investion.domain.models.investment.model.InvestmentPreis;
import de.janick.investion.domain.spi.InvestmentPreisPersistenceService;
import de.janick.investion.persistence.investment.mapper.InvestmentPreisPersistenceMapper;
import de.janick.investion.persistence.investment.model.InvestmentPreisDataModel;
import de.janick.investion.persistence.investment.repository.InvestmentPreisRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class InvestmentPreisPersistenceServiceImpl implements InvestmentPreisPersistenceService {

    private final InvestmentPreisRepository investmentRepository;
    private final InvestmentPreisPersistenceMapper investmentMapper;

    @Override
    public List<InvestmentPreis> findAll() {
        return investmentMapper.mapToDomain(investmentRepository.findAll());
    }

    @Override
    public InvestmentPreis getById(Long id) {
        InvestmentPreisDataModel model = investmentRepository.findById(id)
                .orElseThrow(() -> new IllegalStateException(String.format("InvestmentPreis %d nicht gefunden", id)));
        return investmentMapper.mapToDomain(model);
    }

    @Override
    public InvestmentPreis create(InvestmentPreis investment) {
        return investmentMapper.mapToDomain(investmentRepository.save(investmentMapper.mapFromDomain(investment)));
    }

    @Override
    public InvestmentPreis update(InvestmentPreis investment) {
        if (investment.getId() == null) {
            throw new IllegalStateException(String.format("InvestmentPreis %d wurde noch nicht angelegt. Bitte create nutzen", investment.getId()));
        }
        return investmentMapper.mapToDomain(investmentRepository.save(investmentMapper.mapFromDomain(investment)));
    }

    @Override
    public void delete(Long id) {
        InvestmentPreisDataModel model = investmentRepository.findById(id)
                .orElseThrow(() -> new IllegalStateException(String.format("InvestmentPreis %d nicht gefunden", id)));
        investmentRepository.delete(model);
    }
}
