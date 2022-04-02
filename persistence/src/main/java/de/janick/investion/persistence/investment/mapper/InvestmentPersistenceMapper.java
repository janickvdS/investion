package de.janick.investion.persistence.investment.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import de.janick.investion.domain.models.investment.model.Investment;
import de.janick.investion.persistence.investment.model.InvestmentDataModel;

@Mapper(componentModel = "spring")
public interface InvestmentPersistenceMapper {
    Investment mapToDomain(InvestmentDataModel model);

    List<Investment> mapToDomain(List<InvestmentDataModel> model);

    InvestmentDataModel mapFromDomain(Investment model);

    List<InvestmentDataModel> mapFromDomain(List<Investment> model);
}
