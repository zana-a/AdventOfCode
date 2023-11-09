package adventofcode_2015;

import org.junit.jupiter.api.Test;

import static adventofcode._2015.Day01.calculateLevel;
import static adventofcode._2015.Day01.calculatePositionOfBasement;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Day 01: Not Quite Lisp - Test
 */
public class Day01Test {
    @Test
    void testBalanced() {
        assertEquals(0, calculateLevel("(())"));
        assertEquals(0, calculateLevel("()()"));
    }

    @Test
    void testPositive() {
        assertEquals(3, calculateLevel("((("));
        assertEquals(3, calculateLevel("(()(()("));
        assertEquals(3, calculateLevel("))((((("));
    }

    @Test
    void testNegative() {
        assertEquals(-1, calculateLevel("())"));
        assertEquals(-1, calculateLevel("))("));
        assertEquals(-3, calculateLevel(")))"));
        assertEquals(-3, calculateLevel(")())())"));
    }

    @Test
    void testPositionOfBasement() throws Exception {
        assertEquals(1, calculatePositionOfBasement(")"));
        assertEquals(5, calculatePositionOfBasement("()())"));
    }
}
