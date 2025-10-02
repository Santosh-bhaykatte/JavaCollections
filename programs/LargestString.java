package javaCollections.programs;

public class LargestString {
    static String findLargestString(String[] fruits) {
        String largest = fruits[0];
        for (int i = 0; i < fruits.length-1; ++i) {
            if (largest.compareToIgnoreCase(fruits[i+1]) < 0) {
                largest = fruits[i+1];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        String[] fruits = {"apple", "apple!", "app"};
        System.out.println("Largest string: "+ findLargestString(fruits));
    }
}
