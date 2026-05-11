package com.java.exam;

import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine().replace(" ", "").toLowerCase();
        String str2 = sc.nextLine().replace(" ", "").toLowerCase();

        int[] freq = new int[26];

        for (int i = 0; i < str1.length(); i++) {
            freq[str1.charAt(i) - 'a']++;
        }

        for (int i = 0; i < str2.length(); i++) {
            freq[str2.charAt(i) - 'a']--;
        }

        boolean anagram = true;

        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0) {
                anagram = false;
                break;
            }
        }

        if (anagram)
            System.out.println("Anagrams");
        else
            System.out.println("Not Anagrams");
    }
}
