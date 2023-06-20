package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class ElementManipulation {

    public List<Character> mostCommonElementUsingStreams (List<Character> listOfCharacters) {
        CharacterCount characterCount = new CharacterCount();
        Map<Character, Long> mapOfCharacterAndCount = characterCount.characterCountUsingJavaStream(listOfCharacters);

        List<Character> maxCharacters = new ArrayList<>();
        Optional <Long> maxValue = mapOfCharacterAndCount.values().stream().max(Comparator.naturalOrder());

        if(maxValue.isPresent()) {
            maxCharacters = mapOfCharacterAndCount.entrySet().stream()
                    .filter(each -> each.getValue().equals(maxValue.get()))
                    .map(Map.Entry::getKey)
                    .toList();
        }
            return maxCharacters;
    }


    public List<Character> mostCommonElement (List<Character> listOfCharacters) {
        CharacterCount characterCount = new CharacterCount();
        Map<Character, Integer> mapOfCharacterAndCount = characterCount.characterCount(listOfCharacters);

       characterCount.characterCount(listOfCharacters);

        //get maximum
        List<Character> mostCommonElements = new ArrayList<>();
        int maximumValue = 0;

        for(Map.Entry<Character, Integer> eachEntry: mapOfCharacterAndCount.entrySet()){

            if(maximumValue < eachEntry.getValue()){
                maximumValue = eachEntry.getValue();
                mostCommonElements.add(eachEntry.getKey());
            }
        }

        return mostCommonElements;
    }


    public List<Character> removingElements(List<Character> listOfCharacters){
       List<Character> mostCommonCharacters = mostCommonElement(listOfCharacters);

        listOfCharacters.removeIf(eachCharacter -> !mostCommonCharacters.contains(eachCharacter));

       return listOfCharacters;

//      7; 0 1 2 3 4 5 6
//       4;
//       7- (4 + 1) = 2;
    }
}
