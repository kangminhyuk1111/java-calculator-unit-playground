package stringcalculator.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// “//;\n1;2;3”
public class StringParser {

    private static final Integer BEGIN_INDEX = 2;
    private static final String START_DELIMITER = "//";
    private static final String END_DELIMITER = "\n";

    private final List<String> delimiters;

    public StringParser() {
        this.delimiters = new ArrayList<>();
        addDefaultDelimiters();
    }

    private void addDefaultDelimiters() {
        delimiters.add(",");
        delimiters.add(":");
    }

    public int[] extractNumberFromInput(String input) {
        String delimiterPattern = getDelimiterPattern(input);

        return Arrays.stream(input.split(delimiterPattern)).mapToInt(Integer::parseInt).toArray();
    }

    private String getDelimiterPattern(String input) {
        return
    }

    public List<String> getDelimiters(String input) {
        String customDelimiter = getCustomDelimiters(input);

        return this.delimiters;
    }

    private String getCustomDelimiters(String input) {
        final int endIndex = input.indexOf(END_DELIMITER);
        return input.substring(BEGIN_INDEX, endIndex);
    }
}
