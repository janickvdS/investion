package de.janick.investion.config;

import org.springframework.context.annotation.Bean;

import de.janick.investion.domain.spi.InvestmentPersistenceService;
import de.janick.investion.persistence.investment.mapper.InvestmentPersistenceMapper;
import de.janick.investion.persistence.investment.repository.InvestmentRepository;
import de.janick.investion.persistence.investment.service.InvestmentPersistenceServiceImpl;

@org.springframework.context.annotation.Configuration
public class PersistenceConfig {

    @Bean
    InvestmentPersistenceService getInvestmentPersistenceService(InvestmentRepository repository, InvestmentPersistenceMapper mapper) {
        return new InvestmentPersistenceServiceImpl(repository, mapper);
    }

}
