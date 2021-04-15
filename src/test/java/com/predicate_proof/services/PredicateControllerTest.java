package com.predicate_proof.services;

import static org.mockito.Mockito.anyString;
import static org.mockito.Mockito.when;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.ContentResultMatchers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@ContextConfiguration(classes = {PredicateController.class})
@ExtendWith(SpringExtension.class)
public class PredicateControllerTest {
    @Autowired
    private PredicateController predicateController;

    @MockBean
    private PredicateService predicateService;

    @Test
    public void testLogicProofKlausur() throws Exception {
        when(this.predicateService.logicProofKlausur(anyString())).thenReturn(true);

        InputString inputString = new InputString();
        inputString.setInput("Input");
        String content = (new ObjectMapper()).writeValueAsString(inputString);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/klausur")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        ResultActions resultActions = MockMvcBuilders.standaloneSetup(this.predicateController)
                .build()
                .perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("application/json"));
        ContentResultMatchers contentResult = MockMvcResultMatchers.content();
        resultActions.andExpect(contentResult.string(Matchers.containsString(Boolean.TRUE.toString())));
    }
}

