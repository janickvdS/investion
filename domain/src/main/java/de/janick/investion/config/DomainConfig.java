package de.janick.investion.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import de.janick.investion.api.InvestmentService;
import de.janick.investion.models.investment.service.InvestmentServiceImpl;
import de.janick.investion.spi.InvestmentPersistenceService;

@Configuration
public class DomainConfig {

    @Bean
    public InvestmentService getInvestmentService(InvestmentPersistenceService investmentPersistenceService) {
        return new InvestmentServiceImpl(investmentPersistenceService);
    }
}