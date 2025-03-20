package com.java.practise;

public class GCDOfStrings {
    public static void main(String[] args) {
        System.out.println(gcdOfStrings("AAAAAAAAAA", "AAAAAAAA")); // Output: "ABC"
        System.out.println(gcdOfStrings("ABABAB", "ABAB")); // Output: "AB"
        System.out.println(gcdOfStrings("LEET", "CODE")); // Output: ""
    }

    public static String gcdOfStrings(String str1, String str2) {
        // Check if str1 + str2 is equal to str2 + str1
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        // Find the greatest common divisor of the lengths of str1 and str2
        int gcdLength = gcd(str1.length(), str2.length());

        // Return the substring of str1 from 0 to gcdLength
        return str1.substring(0, gcdLength);
    }

    // Helper function to find the greatest common divisor of two numbers
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
