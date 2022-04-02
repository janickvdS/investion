package de.janick.investion.entities.investment.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import de.janick.investion.entities.investment.model.InvestmentDataModel;
import de.janick.investion.models.investment.model.Investment;

@Mapper(componentModel = "spring")
public interface InvestmentPersistenceMapper {
    Investment mapToDomain(InvestmentDataModel model);

    List<Investment> mapToDomain(List<InvestmentDataModel> model);

    InvestmentDataModel mapFromDomain(Investment model);

    List<InvestmentDataModel> mapFromDomain(List<Investment> model);
}
