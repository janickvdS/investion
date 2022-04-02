package de.janick.investion.endpoints.investment.rest;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import de.janick.investion.endpoints.investment.model.InvestmentResponse;
import de.janick.investion.endpoints.investment.service.InvestmentEndpointService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("api/v1/investments")
public class InvestmentController {

    private final InvestmentEndpointService service;

    @GetMapping
    public ResponseEntity<List<InvestmentResponse>> findAll() {
        return new ResponseEntity<>(service.findAll(), OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<InvestmentResponse> getById(@PathVariable("id") long id) {
        return new ResponseEntity<>(service.getById(id), OK);
    }

    @PostMapping
    public ResponseEntity<InvestmentResponse> create(@RequestBody InvestmentResponse investment) {
        return new ResponseEntity<>(service.create(investment), CREATED);
    }

    @PutMapping
    public ResponseEntity<InvestmentResponse> update(@RequestBody InvestmentResponse investment) {
        return new ResponseEntity<>(service.update(investment), OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> delete(@PathVariable("id") long id) {
        service.delete(id);
        return new ResponseEntity<>(OK);
    }
}
