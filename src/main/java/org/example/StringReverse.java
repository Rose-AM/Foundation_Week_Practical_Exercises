package org.example;

import java.util.stream.IntStream;

public class StringReverse {

    public String reverseUsingStringBuilder(String value) {
        return new StringBuilder(value).reverse().toString();
    }

//    First, remove the first character from the string and append that character at the end of the string.
//    Repeat the above step until the input string becomes empty.
    public String reverseUsingRecursion(String value) {
//checks if the string is empty and if true returns the same string
        if (value.isEmpty()) {
            return value;
        } else {
            return reverseUsingRecursion(value.substring(1) ) + value.charAt(0);
        }
    }

    public String reverseByStreamAndStringBuilder(String value){
       return IntStream.range(0, value.length())
                .mapToObj(index -> value.charAt(value.length() -1 - index))
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString();
    }

    public String reverseByReverseIteration(String value){
        char[] characterArray = value.toCharArray();
        String reversedValue = "";

        for(int i = value.length()-1; i >= 0; i--){
            reversedValue += characterArray[i];
        }

        return reversedValue;

    }

}
