package CW;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FeastTest {

    @Test
    void feast() {
        assertTrue(Feast.feast("great blue heron", "garlic nann"));
        assertTrue(Feast.feast("chickadee", "chocolate cake"));
        assertFalse(Feast.feast("brown bear", "bear claw"));

    }
}