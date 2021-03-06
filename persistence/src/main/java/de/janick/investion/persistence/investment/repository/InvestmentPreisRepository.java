package de.janick.investion.persistence.investment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import de.janick.investion.persistence.investment.model.InvestmentPreisDataModel;

@Repository
public interface InvestmentPreisRepository extends JpaRepository<InvestmentPreisDataModel, Long> {
}
