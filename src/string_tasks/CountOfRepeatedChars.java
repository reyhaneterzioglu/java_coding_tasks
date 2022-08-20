package string_tasks;

public class CountOfRepeatedChars {

    public static void main(String[] args) {

        String str = "aabcccddaaaa";

        System.out.println(countChars(str));
    }

    public static String countChars(String str) {

        String result = "";
        int count = 0;
        char temp = str.charAt(0);

        for (char each : str.toCharArray()) {
            if (temp == each) {
                count++;
            } else {
                result += "" + temp + count;
                temp = each;
                count = 1;
            }
        }
        result += "" + temp + count;

        return result;
    }


}
 /*
        Write a method that compresses a string based on the count of repeated characters.
        aabcccddaaaa -->  a2b1c3d2a4

 */
