package com.extremecoder;

public class NumberOf1Bits_191 {
    static int hammingWeight(int n) {
        int count = 0;
        for (int i= 0; i <=32; i++) {
            if ((n & 1 ) == 1) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(hammingWeight(00000000000000001011));
        System.out.println(hammingWeight(000000000000010000000));
        System.out.println(hammingWeight(00000000000011111101));
    }
}
