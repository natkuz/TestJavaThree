package seminars.third.hw;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class MainHWTest {

    // HW 3.1
    @Test
    void testEvenNumber() {
        boolean res = MainHW.evenOddNumber(2);
        assertTrue(res);
    }

    @Test
    void testOddNumber() {
        boolean res = MainHW.evenOddNumber(3);
        assertFalse(res);
    }

    // HW 3.2
    @ParameterizedTest
    @ValueSource(ints = {26, 27, 98 ,99})
    void testNumberInInterval(int i) {
        boolean res = MainHW.numberInInterval(i);
        assertTrue(res);
    }

    @ParameterizedTest
    @ValueSource(ints = {24, 25, 100, 101})
    void testNumberOutInterval(int i) {
        boolean res = MainHW.numberInInterval(i);
        assertFalse(res);
    }

}