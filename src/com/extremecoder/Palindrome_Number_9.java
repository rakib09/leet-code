package com.extremecoder;

public class Palindrome_Number_9 {
    public static boolean isPalindrome(int x) {
        if (x < 0) {
           return false;
        }
        long reservedX = x;
        long reversedX = 0;
        while (x != 0 ) {
            reversedX = reversedX * 10 + x %10;
            x = x /10;
        }
        return reservedX == reversedX;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(1211));
    }
}
