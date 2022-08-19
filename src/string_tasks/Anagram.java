package string_tasks;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        String str = "abba", str2 = "bab";

        boolean isAnagram = anagram(str, str2);

        System.out.println(isAnagram);

        System.out.println(anagram2(str, str2));

        System.out.println(anagram3(str, str2));

    }

    //solution 1
    public static boolean anagram(String str, String str2) {

        if (str.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {

            if (!str2.contains(str.charAt(i) + "")) {
                return false;
            }
        }

        return true;
    }

    //solution 2
    public static boolean anagram2(String str, String str2) {

        String[] arr = str.split("");
        Arrays.sort(arr);

        String[] arr2 = str2.split("");
        Arrays.sort(arr2);

        return Arrays.equals(arr, arr2);


    }

    //solution 3
    public static boolean anagram3(String str, String str2) {

        if (str.length() != str2.length()) {
            return false;
        }
        for (char each : str.toCharArray()) {
            if (!str2.contains(each + "")) {
                return false;
            }
        }

        return true;
    }

}

 /*
    Write a  function that check if a string is build out of the same letters as another string.
            Ex: same("abc", "cab"); -> true
                same("abc", "abb"); -> false

     */


