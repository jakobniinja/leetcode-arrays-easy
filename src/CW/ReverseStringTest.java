package CW;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseStringTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.Test
    void reverseString() {
        assertEquals("dlrow", ReverseString.reverseString("world"));
    }
}