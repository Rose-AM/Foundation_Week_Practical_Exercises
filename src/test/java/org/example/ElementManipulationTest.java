package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ElementManipulationTest {
    List<Character> listOfCharacters = new ArrayList<>();
    Map<Character, Integer> mapOfCharacterAndCount = new HashMap<>();

    @BeforeEach
    void setup(){
        listOfCharacters.add('r');
        listOfCharacters.add('r');
        listOfCharacters.add('r');
        listOfCharacters.add('r');
        listOfCharacters.add('o');
        listOfCharacters.add('s');
        listOfCharacters.add('e');

        mapOfCharacterAndCount.put('r', 4);
        mapOfCharacterAndCount.put('o', 1);
        mapOfCharacterAndCount.put('s', 1);
        mapOfCharacterAndCount.put('e', 1);
    }

    @Test
    void mostCommonElementUsingStreams() {
        CharacterCount characterCount = Mockito.mock(CharacterCount.class);
        ElementManipulation underTest = new ElementManipulation();

        Mockito.when(characterCount.characterCount(listOfCharacters)).thenReturn(mapOfCharacterAndCount);

        List<Character> actual = underTest.mostCommonElementUsingStreams(listOfCharacters);
        List<Character> expected = new ArrayList<>();
        expected.add('r');


        assertEquals(expected, actual);
    }

    @Test
    void mostCommonElement() {
        CharacterCount characterCount = Mockito.mock(CharacterCount.class);
        ElementManipulation underTest = new ElementManipulation();


        Mockito.when(characterCount.characterCount(listOfCharacters)).thenReturn(mapOfCharacterAndCount);

        List<Character> actual = underTest.mostCommonElement(listOfCharacters);
        List<Character> expected = new ArrayList<>();
        expected.add('r');

        assertEquals(expected, actual);
    }

    @Test
    void removingElements() {
        ElementManipulation underTest = new ElementManipulation();

        List<Character> actual = underTest.removingElements(listOfCharacters);
        List<Character> expected = new ArrayList<>();
        expected.add('r');
        expected.add('r');
        expected.add('r');
        expected.add('r');

        assertEquals(expected, actual);


    }

}