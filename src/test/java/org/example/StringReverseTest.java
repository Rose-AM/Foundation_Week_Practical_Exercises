package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class StringReverseTest {

    @Test
    public void reverseUsingStringBuilder() {
        StringReverse underTest = new StringReverse();
        String expected = "esor";
        Assertions.assertEquals(expected, underTest.reverseUsingStringBuilder("rose"));
    }

    @Test
    public void reverseUsingRecursion() {
        StringReverse underTest = new StringReverse();
        String expected = "esor";
        Assertions.assertEquals(expected, underTest.reverseUsingRecursion("rose"));
    }

    @Test
    public void reverseByStreamAndStringBuilder() {
        StringReverse underTest = new StringReverse();
        String expected = "esor";
        Assertions.assertEquals(expected, underTest.reverseByStreamAndStringBuilder("rose"));
    }

    @Test
    public void reverseByReverseIteration(){
        StringReverse underTest = new StringReverse();
        String expected = "esor";
        Assertions.assertEquals(expected, underTest.reverseByReverseIteration("rose"));
    }
}