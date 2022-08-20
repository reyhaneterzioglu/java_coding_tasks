package string_tasks;

import java.util.Arrays;
import java.util.Collections;

public class CountUniqueChars {

    public static void main(String[] args) {

        String str = "aabbcddeef";

        System.out.println(countUniqueChars(str));

        System.out.println(countUniqueChars2(str));
    }

    //solution 1
    public static int countUniqueChars(String str) {
        int uniqueCount = 0;
        for (int i = 0; i < str.length(); i++) {
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }

            if (count == 1) {
                uniqueCount++;
            }
        }

        return (uniqueCount == 0) ? -1 : uniqueCount;

    }

    //solution 2
    public static int countUniqueChars2(String str) {
        int countUnique = 0;

        for (String each : str.split("")) {
            if (Collections.frequency(Arrays.asList(str.split("")), each) == 1) {
                countUnique++;
            }
        }

        return (countUnique == 0) ? -1 : countUnique;
    }
}

/*
        Write a Java program to count unique Characters in string.
        Given a string as input, write Java code to count and print the number of unique characters in String.
        If there are no unique characters in the string, the method returns -1
     */