package adventofcode._2015;

/**
 * Day 01: Not Quite Lisp
 */
public class Day01 {

    public static long calculateLevel(String input) {
        var characters = input.chars().mapToObj(integer -> (char) integer).toList();
        var positive = characters.stream().filter(character -> character == '(').count();
        var negative = characters.stream().filter(character -> character == ')').count();
        return positive - negative;
    }

    public static long calculatePositionOfBasement(String input) throws Exception {
        var characters = input.toCharArray();
        var level = 0;
        for (var position = 0; position <= characters.length; position++) {
            if (level == -1) return position;
            var currentCharacter = characters[position];
            if (currentCharacter == '(') level += 1;
            if (currentCharacter == ')') level -= 1;
        }
        throw new Exception("No basement");
    }
}
