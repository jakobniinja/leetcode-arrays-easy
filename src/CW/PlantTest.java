package CW;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PlantTest {

    @Test
    void plant() {
        assertEquals("---,,,,,,,---,,,,,,,---,,,,,,,", Plant.plant(',', 3, 7, 25));
        assertEquals("-+", Plant.plant('+', 1, 3, 15));
        assertEquals("---------;;;;;;;;;;---------;;;;;;;;;;---------;;;;;;;;;;---------;;;;;;;;;;---------;;;;;;;;;;---------;;;;;;;;;;---------;;;;;;;;;;---------;;;;;;;;;;---------;;;;;;;;;;", Plant.plant(';', 9, 10, 30));
    }
}