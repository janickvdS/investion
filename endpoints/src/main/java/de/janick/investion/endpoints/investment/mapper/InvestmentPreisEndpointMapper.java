package de.janick.investion.endpoints.investment.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import de.janick.investion.domain.models.investment.model.InvestmentPreis;
import de.janick.investion.endpoints.investment.model.InvestmentPreisResponse;

@Mapper(componentModel = "spring", uses = InvestmentEndpointMapper.class)
public interface InvestmentPreisEndpointMapper {
    InvestmentPreisResponse toEndpoint(InvestmentPreis model);

    List<InvestmentPreisResponse> toEndpoint(List<InvestmentPreis> model);

    InvestmentPreis fromEndpoint(InvestmentPreisResponse model);

    List<InvestmentPreis> fromEndpoint(List<InvestmentPreisResponse> model);

}
