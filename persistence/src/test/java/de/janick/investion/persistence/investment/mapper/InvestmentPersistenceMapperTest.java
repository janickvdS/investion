package de.janick.investion.persistence.investment.mapper;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import de.janick.investion.domain.models.investment.model.Investment;
import de.janick.investion.persistence.investment.model.INVESTMENTTYP;
import de.janick.investion.persistence.investment.model.InvestmentDataModel;

class InvestmentPersistenceMapperTest {

    InvestmentPersistenceMapper mapper;

    @BeforeEach
    void setUp() {
        mapper = new InvestmentPersistenceMapperImpl();
    }

    @Test
    void mapToDomain() {
        InvestmentDataModel model = null;
        assertThat(mapper.mapToDomain(model)).isNull();

        model = createDataModel();
        assertionsUnique(model, mapper.mapToDomain(model));
    }

    @Test
    void mapListToDomain() {
        List<InvestmentDataModel> model = null;
        assertThat(mapper.mapToDomain(model)).isNull();

        model = List.of(createDataModel(), createDataModel());
        assertionsList(model, mapper.mapToDomain(model));
    }

    @Test
    void mapFromDomain() {
        Investment model = null;
        assertThat(mapper.mapFromDomain(model)).isNull();

        model = createDomainModel();
        assertionsUnique(mapper.mapFromDomain(model), model);
    }

    @Test
    void mapListFromDomain() {
        List<Investment> model = null;
        assertThat(mapper.mapFromDomain(model)).isNull();

        model = List.of(createDomainModel(), createDomainModel());
        assertionsList(mapper.mapFromDomain(model), model);
    }

    @Test
    void mapINVESTMENTTYPFromDomain() {
        Investment model = Investment.builder().build();
        assertThat(mapper.mapFromDomain(model).getInvestmenttyp()).isNull();

        for (de.janick.investion.domain.models.investment.model.INVESTMENTTYP typ : de.janick.investion.domain.models.investment.model.INVESTMENTTYP.values()) {
            model = Investment.builder().investmenttyp(typ).build();
            assertionsUnique(mapper.mapFromDomain(model), model);
        }
    }

    @Test
    void mapINVESTMENTTYPToDomain() {
        InvestmentDataModel model = InvestmentDataModel.builder().build();
        assertThat(mapper.mapToDomain(model).getInvestmenttyp()).isNull();

        for (INVESTMENTTYP typ : INVESTMENTTYP.values()) {
            model = InvestmentDataModel.builder().investmenttyp(typ).build();
            assertionsUnique(model, mapper.mapToDomain(model));
        }
    }

    void assertionsUnique(InvestmentDataModel model, Investment domain) {
        assertThat(model.getId()).isEqualTo(domain.getId());
        assertThat(model.getInvestmenttyp().name()).isEqualTo(domain.getInvestmenttyp().name());
        assertThat(model.getIsin()).isEqualTo(domain.getIsin());
        assertThat(model.getWkn()).isEqualTo(domain.getWkn());
        assertThat(model.getSymbol()).isEqualTo(domain.getSymbol());
        assertThat(model.getUnternehmen()).isEqualTo(domain.getUnternehmen());
    }

    void assertionsList(List<InvestmentDataModel> model, List<Investment> domain) {
        assertThat(model).hasSameSizeAs(domain);
        for (int i = 0; i < model.size(); i++) {
            assertionsUnique(model.get(i), domain.get(i));
        }
    }

    protected InvestmentDataModel createDataModel() {
        return InvestmentDataModel.builder()
                .id(1L)
                .investmenttyp(INVESTMENTTYP.AKTIE)
                .isin("DE1234")
                .symbol("AAPL")
                .wkn("A2D")
                .unternehmen("Apple")
                .build();
    }

    protected Investment createDomainModel() {
        return Investment.builder()
                .id(1L)
                .investmenttyp(de.janick.investion.domain.models.investment.model.INVESTMENTTYP.AKTIE)
                .isin("DE1234")
                .symbol("AAPL")
                .wkn("A2D")
                .unternehmen("Apple")
                .build();
    }
}