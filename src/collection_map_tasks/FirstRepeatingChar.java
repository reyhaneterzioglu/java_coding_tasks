package collection_map_tasks;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatingChar {

    public static void main(String[] args) {

        String str = "Java developer";

        System.out.println(firstRepeating(str));

    }

    public static Character firstRepeating(String str) {

        Set<Character> set = new HashSet<>();

        for (char each : str.toCharArray()) {
            if (set.contains(each)) return each;
            else set.add(each);
        }

        return null;

    }


}
