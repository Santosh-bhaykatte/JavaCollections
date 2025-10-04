package javaCollections.programs;

public class StringCompression {
    static String stringCompression(String str) {
        StringBuilder sb = new StringBuilder("");
        int count = 1;
        int i;
        for (i = 0; i < str.length()-1; ++i) {
            if (str.charAt(i) == str.charAt(i+1)) {
                count++;
            } else {
                sb.append(str.charAt(i)).append(count);
                count = 1;
            }
        }
        sb.append(str.charAt(i)).append(count);

        if (sb.length() > str.length()) {
            return str;
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "aaabbc";
        System.out.println(stringCompression(s));
    }
}
