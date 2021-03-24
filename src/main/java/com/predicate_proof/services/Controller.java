package com.predicate_proof.services;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private final PredicateService predicateService;

    public Controller(PredicateService predicateService) {
        this.predicateService = predicateService;
    }

    @PostMapping(path = "klausur",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean logicProofKlausur(@RequestBody InputString input) {
        return predicateService.logicProofKlausur(input.getInput());
    }
}
