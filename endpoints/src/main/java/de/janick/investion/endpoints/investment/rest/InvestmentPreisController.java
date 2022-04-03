package de.janick.investion.endpoints.investment.rest;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import de.janick.investion.endpoints.investment.model.InvestmentPreisResponse;
import de.janick.investion.endpoints.investment.service.InvestmentPreisEndpointService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("api/v1/investmentpreise")
public class InvestmentPreisController {

    private final InvestmentPreisEndpointService service;

    @GetMapping
    public ResponseEntity<List<InvestmentPreisResponse>> findAll() {
        return new ResponseEntity<>(service.findAll(), OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<InvestmentPreisResponse> getById(@PathVariable("id") long id) {
        return new ResponseEntity<>(service.getById(id), OK);
    }

    @PostMapping
    public ResponseEntity<InvestmentPreisResponse> create(@RequestBody InvestmentPreisResponse investment) {
        return new ResponseEntity<>(service.create(investment), CREATED);
    }

    @PutMapping
    public ResponseEntity<InvestmentPreisResponse> update(@RequestBody InvestmentPreisResponse investment) {
        return new ResponseEntity<>(service.update(investment), OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(@PathVariable("id") long id) {
        service.delete(id);
        return new ResponseEntity<>(OK);
    }
}
