package javaCollections.programs;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
    static boolean isAnagram(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.hashCode(arr1) == Arrays.hashCode(arr2)) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string 1: ");
        String s1 = sc.nextLine();
        System.out.print("Enter string 2: ");
        String s2 = sc.nextLine();

        System.out.println("Is Anagram: "+ isAnagram(s1, s2));
    }
}
