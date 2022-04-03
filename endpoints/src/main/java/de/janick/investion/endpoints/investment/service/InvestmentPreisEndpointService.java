package de.janick.investion.endpoints.investment.service;

import java.util.List;

import de.janick.investion.domain.api.InvestmentPreisService;
import de.janick.investion.endpoints.investment.mapper.InvestmentPreisEndpointMapper;
import de.janick.investion.endpoints.investment.model.InvestmentPreisResponse;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class InvestmentPreisEndpointService {

    private final InvestmentPreisEndpointMapper mapper;
    private final InvestmentPreisService service;

    public List<InvestmentPreisResponse> findAll() {
        return mapper.toEndpoint(service.findAll());
    }

    public InvestmentPreisResponse getById(Long id) {
        return mapper.toEndpoint(service.getById(id));
    }

    public InvestmentPreisResponse create(InvestmentPreisResponse investment) {
        return mapper.toEndpoint(service.create(mapper.fromEndpoint(investment)));
    }

    public InvestmentPreisResponse update(InvestmentPreisResponse investment) {
        return mapper.toEndpoint(service.create(mapper.fromEndpoint(investment)));
    }

    public void delete(Long id) {
        service.delete(id);
    }
}
