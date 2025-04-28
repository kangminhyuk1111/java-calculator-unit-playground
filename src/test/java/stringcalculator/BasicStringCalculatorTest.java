package stringcalculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import stringcalculator.util.StringParser;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BasicStringCalculatorTest {

    private final StringCalculator sc = new BasicStringCalculator(new StringParser());

    @Test
    @DisplayName("값 입력시 올바른 반환")
    void addString() {
        final String input = "1,2,3";

        final int result = sc.add(input);

        assertEquals(result, 6);
    }
}