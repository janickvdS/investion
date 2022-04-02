package de.janick.investion.endpoints.investment.service;

import java.util.List;

import de.janick.investion.domain.api.InvestmentService;
import de.janick.investion.endpoints.investment.mapper.InvestmentEndpointMapper;
import de.janick.investion.endpoints.investment.model.InvestmentResponse;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class InvestmentEndpointService {

    private final InvestmentEndpointMapper mapper;
    private final InvestmentService service;

    public List<InvestmentResponse> findAll() {
        return mapper.toEndpoint(service.findAll());
    }

    public InvestmentResponse getById(Long id) {
        return mapper.toEndpoint(service.getById(id));
    }

    public InvestmentResponse create(InvestmentResponse investment) {
        return mapper.toEndpoint(service.create(mapper.fromEndpoint(investment)));
    }

    public InvestmentResponse update(InvestmentResponse investment) {
        return mapper.toEndpoint(service.create(mapper.fromEndpoint(investment)));
    }

    public void delete(Long id) {
        service.delete(id);
    }
}
