package guru.springframework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Junit5Test {

    @Test
    void someFauxTest() {

        assertEquals("foo", "foo");
    }
}
