package com.georgidinov;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainIT {

    @Test
    void testIntegrationTestSim() {
        assertEquals("Hello World", new Main().getHw());
    }
}
