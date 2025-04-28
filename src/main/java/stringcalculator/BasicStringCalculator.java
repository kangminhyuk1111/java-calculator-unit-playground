package stringcalculator;

import stringcalculator.util.StringParser;

import java.util.Arrays;

public class BasicStringCalculator implements StringCalculator {

    private final StringParser stringParser;

    public BasicStringCalculator(final StringParser stringParser) {
        this.stringParser = stringParser;
    }

    @Override
    public int add(final String str) {
        int[] numbers = stringParser.extractNumberFromInput(str);

        return Arrays.stream(numbers).sum();
    }
}
