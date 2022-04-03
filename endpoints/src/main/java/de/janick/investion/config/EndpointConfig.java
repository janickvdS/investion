package de.janick.investion.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import de.janick.investion.domain.api.InvestmentPreisService;
import de.janick.investion.domain.api.InvestmentService;
import de.janick.investion.endpoints.investment.mapper.InvestmentEndpointMapper;
import de.janick.investion.endpoints.investment.mapper.InvestmentPreisEndpointMapper;
import de.janick.investion.endpoints.investment.service.InvestmentEndpointService;
import de.janick.investion.endpoints.investment.service.InvestmentPreisEndpointService;

@Configuration
public class EndpointConfig {

    @Bean
    public InvestmentEndpointService investmentEndpointService(InvestmentEndpointMapper mapper, InvestmentService service) {
        return new InvestmentEndpointService(mapper, service);
    }

    @Bean
    public InvestmentPreisEndpointService investmentPreisEndpointService(InvestmentPreisEndpointMapper mapper, InvestmentPreisService service) {
        return new InvestmentPreisEndpointService(mapper, service);
    }
}
