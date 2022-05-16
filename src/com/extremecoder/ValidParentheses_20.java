package com.extremecoder;

import java.util.Stack;

public class ValidParentheses_20 {
    public static boolean isValid(String s) {
        Stack<Character> characters = new Stack<>();
        for (char c : s.toCharArray()) {
            if(c == '(' || c == '{' || c == '[') {
                characters.push(c);
            } else if (c == ')' && !characters.empty() && characters.peek() == '(') {
                characters.pop();
            } else if (c == '}' && !characters.empty() && characters.peek() == '{') {
                characters.pop();
            } else if (c == ']' && !characters.empty() && characters.peek() == '[') {
                characters.pop();
            } else {
                return false;
            }
        }
        return characters.empty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));
        System.out.println(isValid("([)]"));
        System.out.println(isValid("{[]}"));
    }
}
