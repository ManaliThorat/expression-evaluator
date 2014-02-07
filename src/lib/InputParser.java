package lib;

/**
 * Created by manalit on 2/7/14.
 */
public class InputParser {
    public String parse(String input) {
        return input.trim().replaceAll(" +", "")
                .replaceAll("\\+", " + ")
                .replaceAll("\\-", " - ")
                .replaceAll("\\*", " * ")
                .replaceAll("/", " / ")
                .replaceAll("\\(", "(")
                .replaceAll("\\)", ")")
                .replaceAll("\\^", " ^ ")
                .replaceAll("  - ", " -")
                .replaceFirst("^ - ", "-")
                .replaceAll("\\( - ", "(-")
                .replaceAll("\\--", " + ");
    }
}
