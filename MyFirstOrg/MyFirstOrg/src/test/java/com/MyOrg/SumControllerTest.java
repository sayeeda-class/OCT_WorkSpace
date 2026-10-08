package com.MyOrg;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest
class SumControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldReturnSumOfTwoNumbers() throws Exception {
        mockMvc.perform(get("/add").param("a", "5").param("b", "7"))
                .andExpect(status().isOk())
                .andExpect(content().json("{\"a\":5,\"b\":7,\"sum\":12}"));
    }
}
