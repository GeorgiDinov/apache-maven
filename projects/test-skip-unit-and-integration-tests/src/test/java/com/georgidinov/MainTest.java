package com.georgidinov;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;


public class MainTest {

    @Test
    void testNotEqual() {
        assertNotEquals("foo", new Main().getHw());
    }
}
