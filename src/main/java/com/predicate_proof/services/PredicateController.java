package com.predicate_proof.services;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author David Nickel
 * @version 1.0 24/03/2021
 */
@RestController
public class PredicateController {

    private final PredicateService predicateService;

    public PredicateController(PredicateService predicateService) {
        this.predicateService = predicateService;
    }

    @PostMapping(path = "klausur",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean logicProofKlausur(@RequestBody InputString input) {
        return predicateService.logicProofKlausur(input.getInput());
    }
}
