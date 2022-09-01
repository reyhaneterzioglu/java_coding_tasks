package collection_map_tasks;

import java.util.*;

public class FirstNonRepeatingChar {

    public static void main(String[] args) {

        String str = "abaccdefdfe";

        System.out.println(firstNonRepeating(str));
    }

    public static Character firstNonRepeating(String s) {

        Map<Character, Integer> map = new HashMap<>();

        int count;
        for (char each : s.toCharArray()) {

            if (map.containsKey(each)) {
                count = map.get(each);
                map.put(each, count + 1);
            } else map.put(each, 1);

        }

        for (char each : s.toCharArray()) {

            if (map.get(each) == 1) return each;
        }

        return null;
    }

}
