package javaCollections.programs;

public class LongestString {
    static String findLongestString(String[] fruits) {
        int max = Integer.MIN_VALUE;
        String largestString = "";
        for (int i = 0; i < fruits.length; ++i) {
            int strLen = fruits[i].length();
            if (strLen > max) {
                max = strLen;
                largestString = fruits[i];
            }
        }
        return largestString;
    }
    public static void main(String[] args) {
        String[] fruits = {"apple", "banana", "mango", "peru", "papaya"};
        System.out.println("Largest string: "+ findLongestString(fruits));
    }
}
