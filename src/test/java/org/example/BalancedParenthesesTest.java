package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedParenthesesTest {

    @Test
    void isBalanced() {
        BalancedParentheses underTest = new BalancedParentheses();

        String input1 ="(())";
        String input2 = ")(";
        String input3 = "(()";

        assertTrue(underTest.isBalanced(input1));
        assertFalse(underTest.isBalanced(input3));
    }
}