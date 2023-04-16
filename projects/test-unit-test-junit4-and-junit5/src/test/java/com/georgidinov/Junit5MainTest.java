package com.georgidinov;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;


public class Junit5MainTest {
    @Test
    void testNotEqual() {
        assertNotEquals("Hello WorldXX", new Main().getHw());
    }
}
