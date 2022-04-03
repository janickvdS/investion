package de.janick.investion.config;

import org.springframework.context.annotation.Bean;

import de.janick.investion.domain.spi.InvestmentPersistenceService;
import de.janick.investion.domain.spi.InvestmentPreisPersistenceService;
import de.janick.investion.persistence.investment.mapper.InvestmentPersistenceMapper;
import de.janick.investion.persistence.investment.mapper.InvestmentPreisPersistenceMapper;
import de.janick.investion.persistence.investment.repository.InvestmentPreisRepository;
import de.janick.investion.persistence.investment.repository.InvestmentRepository;
import de.janick.investion.persistence.investment.service.InvestmentPersistenceServiceImpl;
import de.janick.investion.persistence.investment.service.InvestmentPreisPersistenceServiceImpl;

@org.springframework.context.annotation.Configuration
public class PersistenceConfig {

    @Bean
    InvestmentPersistenceService getInvestmentPersistenceService(InvestmentRepository repository, InvestmentPersistenceMapper mapper) {
        return new InvestmentPersistenceServiceImpl(repository, mapper);
    }

    @Bean
    InvestmentPreisPersistenceService getInvestmentPreisPersistenceService(InvestmentPreisRepository repository, InvestmentPreisPersistenceMapper mapper) {
        return new InvestmentPreisPersistenceServiceImpl(repository, mapper);
    }

}
