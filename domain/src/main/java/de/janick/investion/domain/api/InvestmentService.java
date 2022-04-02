package de.janick.investion.domain.api;

import java.util.List;

import de.janick.investion.domain.models.investment.model.Investment;

public interface InvestmentService {
    List<Investment> findAll();

    Investment getById(Long id);

    Investment create(Investment investment);

    Investment update(Investment investment);

    void delete(Long id);

}
