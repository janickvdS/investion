package de.janick.investion.config;

import org.springframework.context.annotation.Bean;

import de.janick.investion.entities.investment.mapper.InvestmentPersistenceMapper;
import de.janick.investion.entities.investment.repository.InvestmentRepository;
import de.janick.investion.entities.investment.service.InvestmentPersistenceServiceImpl;
import de.janick.investion.spi.InvestmentPersistenceService;

@org.springframework.context.annotation.Configuration
public class PersistenceConfig {

    @Bean
    InvestmentPersistenceService getInvestmentPersistenceService(InvestmentRepository repository, InvestmentPersistenceMapper mapper) {
        return new InvestmentPersistenceServiceImpl(repository, mapper);
    }

}
