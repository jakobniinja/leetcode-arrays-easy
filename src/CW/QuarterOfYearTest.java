package CW;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class QuarterOfYearTest {

    @Test
    void quarterOfYear() {
        assertEquals(1, QuarterOfYear.quarterOfYear(3) );
        assertEquals(3, QuarterOfYear.quarterOfYear(8) );
        assertEquals(4, QuarterOfYear.quarterOfYear(11) );
    }
}