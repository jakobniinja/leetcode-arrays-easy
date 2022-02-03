package CW;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

class LastSurvivorTest {

    @Test
    void lastSurvivor() {
        assertEquals("a",LastSurvivor.lastSurvivor("abc", new int[]{1, 1}), String.format("letters: %s coords: %s", "abc", Arrays.toString(new int[]{1, 1})));
        assertEquals("b", LastSurvivor.lastSurvivor("kbc", new int[]{0, 1}), String.format("letters: %s coords: %s", "kbc", Arrays.toString(new int[]{0, 1})));
        assertEquals("z", LastSurvivor.lastSurvivor("zbk", new int[]{2, 1}), String.format("letters: %s coords: %s", "zbk", Arrays.toString(new int[]{2, 1})));
    }
}