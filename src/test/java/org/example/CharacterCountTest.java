package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CharacterCountTest {

    @Test
    void characterCount() {
        Map<Character, Integer> expected = new HashMap<>();
        expected.put('r', 4);
        expected.put('o', 1);
        expected.put('s', 1);
        expected.put('e', 1);

        List<Character> listOfCharacters = new ArrayList<>();
        listOfCharacters.add('r');
        listOfCharacters.add('r');
        listOfCharacters.add('r');
        listOfCharacters.add('r');
        listOfCharacters.add('o');
        listOfCharacters.add('s');
        listOfCharacters.add('e');

        CharacterCount underTest = new CharacterCount();

        Assertions.assertEquals(expected, underTest.characterCount(listOfCharacters));

    }
}