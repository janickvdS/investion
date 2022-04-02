package de.janick.investion.api;

import java.util.List;

import de.janick.investion.models.investment.model.Investment;

public interface InvestmentService {
    List<Investment> findAll();

    Investment getById(Long id);

}
