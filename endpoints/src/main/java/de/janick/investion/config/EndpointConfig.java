package de.janick.investion.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import de.janick.investion.domain.api.InvestmentService;
import de.janick.investion.endpoints.investment.mapper.InvestmentEndpointMapper;
import de.janick.investion.endpoints.investment.service.InvestmentEndpointService;

@Configuration
public class EndpointConfig {

    @Bean
    public InvestmentEndpointService investmentEndpointService(InvestmentEndpointMapper mapper, InvestmentService service) {
        return new InvestmentEndpointService(mapper, service);
    }
}
