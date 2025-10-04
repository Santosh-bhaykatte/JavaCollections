package javaCollections.programs;

import java.util.Scanner;

public class FirstLetterToUppercase {
    static String convertFirstLetterToUppercase(String str) {
        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) == ' ' && i != str.length()-1 && str.charAt(i+1) != ' ') {
                sb.append(str.charAt(i));
                ++i;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                if (i == 0) {
                    sb.append(Character.toUpperCase(str.charAt(i)));
                    continue;
                }
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "  hii, i am santo. i     live at pune  ";
        System.out.println(convertFirstLetterToUppercase(s));
    }
}
