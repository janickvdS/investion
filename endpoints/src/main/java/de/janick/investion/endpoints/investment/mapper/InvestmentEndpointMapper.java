package de.janick.investion.endpoints.investment.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import de.janick.investion.domain.models.investment.model.Investment;
import de.janick.investion.endpoints.investment.model.InvestmentResponse;

@Mapper(componentModel = "spring")
public interface InvestmentEndpointMapper {
    InvestmentResponse toEndpoint(Investment model);

    List<InvestmentResponse> toEndpoint(List<Investment> model);

    Investment fromEndpoint(InvestmentResponse model);

    List<Investment> fromEndpoint(List<InvestmentResponse> model);

}
