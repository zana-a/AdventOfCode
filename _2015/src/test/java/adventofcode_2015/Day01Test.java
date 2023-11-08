package adventofcode_2015;

import adventofcode._2015.Day01;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static adventofcode._2015.Day01.*;
import static org.junit.jupiter.api.Assertions.*;

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
        assertEquals(-3, calculateLevel("())())"));
    }
}
