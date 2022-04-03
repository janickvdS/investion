package de.janick.investion.persistence.investment.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import de.janick.investion.domain.models.investment.model.InvestmentPreis;
import de.janick.investion.persistence.investment.model.InvestmentPreisDataModel;

@Mapper(componentModel = "spring", uses = InvestmentPersistenceMapper.class)
public interface InvestmentPreisPersistenceMapper {
    InvestmentPreis mapToDomain(InvestmentPreisDataModel model);

    List<InvestmentPreis> mapToDomain(List<InvestmentPreisDataModel> model);

    InvestmentPreisDataModel mapFromDomain(InvestmentPreis model);

    List<InvestmentPreisDataModel> mapFromDomain(List<InvestmentPreis> model);
}
