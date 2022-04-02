package de.janick.investion;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import de.janick.investion.persistence.investment.model.INVESTMENTTYP;
import de.janick.investion.persistence.investment.model.InvestmentDataModel;
import de.janick.investion.persistence.investment.repository.InvestmentRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Component
public class Runner implements CommandLineRunner {

    private final InvestmentRepository repository;

    @Override
    public void run(String... args) {
        InvestmentDataModel model = InvestmentDataModel.builder()
                .id(1L)
                .investmenttyp(INVESTMENTTYP.AKTIE)
                .isin("DE1234")
                .symbol("AAPL")
                .wkn("A2D")
                .unternehmen("Apple")
                .build();

        repository.save(model);
    }
}
