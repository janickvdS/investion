package de.janick.investion.domain.spi;

import java.util.List;

import de.janick.investion.domain.models.investment.model.Investment;

public interface InvestmentPersistenceService {
    List<Investment> findAll();

    Investment getById(Long id);

    Investment create(Investment investment);

    Investment update(Investment investment);

    void delete(Long id);

}
