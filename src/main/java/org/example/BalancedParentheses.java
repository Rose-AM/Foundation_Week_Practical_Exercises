package org.example;

import java.util.Deque;

public class BalancedParentheses {

    public boolean isBalanced (String parentheses){
        int openParenthesesCount = 0;
        int closeParenthesesCount = 0;

        for(int i=0; i<parentheses.length(); i++){
            if(parentheses.charAt(i) == '('){
                openParenthesesCount++;
            } else {
                closeParenthesesCount++;
            }
        }

        if (openParenthesesCount == closeParenthesesCount){
            return true;
        } else {
            return false;
        }

    }

    // can as well be accomplished using stack
//    public boolean isBalancedUsingStack(String parentheses){
//        Deque
//    }

}
