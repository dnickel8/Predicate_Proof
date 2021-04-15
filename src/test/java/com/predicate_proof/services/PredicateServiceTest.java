package com.predicate_proof.services;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {PredicateService.class})
@ExtendWith(SpringExtension.class)
public class PredicateServiceTest {
    @Autowired
    private PredicateService predicateService;

    @Test
    public void testLogicProofKlausur() {
        assertTrue(this.predicateService.logicProofKlausur("Input String"));
        assertTrue(this.predicateService.logicProofKlausur("T__0"));
    }
}

