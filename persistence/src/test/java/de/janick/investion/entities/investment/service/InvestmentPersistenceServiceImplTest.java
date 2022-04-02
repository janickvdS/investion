package de.janick.investion.entities.investment.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import de.janick.investion.entities.investment.mapper.InvestmentPersistenceMapper;
import de.janick.investion.entities.investment.model.InvestmentDataModel;
import de.janick.investion.entities.investment.repository.InvestmentRepository;

@ExtendWith(MockitoExtension.class)
class InvestmentPersistenceServiceImplTest {

    @Mock
    InvestmentRepository repository;
    @Mock
    InvestmentPersistenceMapper mapper;

    InvestmentPersistenceServiceImpl service;

    @BeforeEach
    void setUp() {
        service = new InvestmentPersistenceServiceImpl(repository, mapper);
    }

    @Test
    void findAll() {
        List<InvestmentDataModel> list = new ArrayList<>();
        when(repository.findAll()).thenReturn(list);

        service.findAll();
        verify(mapper, times(1)).mapToDomain(list);
    }

    @Test
    void getByIdNotFound() {
        long id = 1;
        when(repository.findById(anyLong())).thenReturn(Optional.empty());
        IllegalStateException thrown = Assertions.assertThrows(IllegalStateException.class, () -> service.getById(id));
        assertThat(thrown.getMessage()).isEqualTo(String.format("Investment %d nicht gefunden", id));
    }

    @Test
    void getById() {
        long id = 1;
        InvestmentDataModel model = new InvestmentDataModel();
        when(repository.findById(anyLong())).thenReturn(Optional.of(model));
        service.getById(id);
        verify(mapper, times(1)).mapToDomain(model);
    }
}