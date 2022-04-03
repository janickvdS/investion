package de.janick.investion.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import de.janick.investion.domain.api.InvestmentPreisService;
import de.janick.investion.domain.api.InvestmentService;
import de.janick.investion.domain.models.investment.service.InvestmentPreisServiceImpl;
import de.janick.investion.domain.models.investment.service.InvestmentServiceImpl;
import de.janick.investion.domain.spi.InvestmentPersistenceService;
import de.janick.investion.domain.spi.InvestmentPreisPersistenceService;

@Configuration
public class DomainConfig {

    @Bean
    public InvestmentService getInvestmentService(InvestmentPersistenceService investmentPersistenceService) {
        return new InvestmentServiceImpl(investmentPersistenceService);
    }

    @Bean
    public InvestmentPreisService getInvestmentPreisService(InvestmentPreisPersistenceService investmentPersistenceService) {
        return new InvestmentPreisServiceImpl(investmentPersistenceService);
    }
}
