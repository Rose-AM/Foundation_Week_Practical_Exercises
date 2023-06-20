package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CharacterCount {
    public Map<Character, Integer> characterCount (List<Character> listOfCharacters){
        Map<Character, Integer> eachCharacterAndCount = new HashMap<>();

        for(Character eachCharacter : listOfCharacters) {
            if(eachCharacterAndCount.containsKey(eachCharacter)){
                eachCharacterAndCount.put(eachCharacter, eachCharacterAndCount.get(eachCharacter) + 1);
            }
            else {
                eachCharacterAndCount.put(eachCharacter, 1);
            }

        }

        return eachCharacterAndCount;
    }



    public Map<Character, Long> characterCountUsingJavaStream (List<Character> listOfCharacters) {
        Map<Character, Long> eachCharacterAndCount = new HashMap<>();

        eachCharacterAndCount = listOfCharacters.stream()
                .collect(
                        Collectors.groupingBy(each -> each, Collectors.counting())
                );

        return eachCharacterAndCount;
    }
}
