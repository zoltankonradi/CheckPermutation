import java.util.Arrays;

public class Main {

    /*

     Cracking the Coding Interview - Arrays and Strings

     1.2 - Check Permutation:
     Given two strings, write a method to decide if one is a permutation of the other.

     */

    public static void main(String[] args) {
        System.out.println(checkForPermutation("Hello World!", "Hello World!"));
        System.out.println(checkForPermutation("World!Hello ", "Hello World!"));
        System.out.println(checkForPermutation("Hello World", "Hello World!"));
        System.out.println(checkForPermutation("Hello World", " World!"));
    }

    public static boolean checkForPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) { return false; }
        char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();
        Arrays.sort(s1Array);
        Arrays.sort(s2Array);
        return Arrays.equals(s1Array, s2Array);
    }
}
