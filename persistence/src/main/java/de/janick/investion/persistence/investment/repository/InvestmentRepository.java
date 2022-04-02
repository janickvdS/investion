package de.janick.investion.persistence.investment.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import de.janick.investion.persistence.investment.model.InvestmentDataModel;

@Repository
public interface InvestmentRepository extends JpaRepository<InvestmentDataModel, Long> {
    Optional<InvestmentDataModel> findByIsin(String isin);

    Optional<InvestmentDataModel> findByWkn(String wkn);

    Optional<InvestmentDataModel> findBySymbol(String symbol);
}
