package de.janick.investion.entities.investment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import de.janick.investion.entities.investment.model.InvestmentDataModel;

@Repository
public interface InvestmentRepository extends JpaRepository<InvestmentDataModel, Long> {
}
