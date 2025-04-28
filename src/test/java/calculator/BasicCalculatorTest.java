package calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BasicCalculatorTest {

    private final Calculator calculator = new BasicCalculator();

    @Test
    @DisplayName("덧셈 테스트")
    void add() {
        int a = 1;
        int b = 2;
        int answer = a + b;

        int result = calculator.add(a, b);

        assertEquals(result, answer);
    }

    @Test
    @DisplayName("뺄셈 테스트")
    void subtract() {
        int a = 2;
        int b = 1;
        int answer = a - b;

        int result = calculator.subtract(a, b);

        assertEquals(result, answer);
    }

    @Test
    @DisplayName("곱셈 테스트")
    void multiply() {
        int a = 3;
        int b = 5;
        int answer = a * b;

        int result = calculator.multiply(a, b);

        assertEquals(result, answer);
    }

    @Test
    @DisplayName("나눗셈 테스트")
    void divide() {
        int a = 4;
        int b = 2;
        int answer = a / b;

        int result = calculator.divide(a, b);

        assertEquals(result, answer);
    }
}
