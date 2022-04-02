package de.janick.investion.spi;

import java.util.List;

import de.janick.investion.models.investment.model.Investment;

public interface InvestmentPersistenceService {
    List<Investment> findAll();

    Investment getById(Long id);


}
