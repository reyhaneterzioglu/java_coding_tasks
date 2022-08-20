package string_tasks;

public class ConvertStringToInteger {

    public static void main(String[] args) {

        String str = "798";

        int number = convertToInteger(str);

        System.out.println(number);

        System.out.println(number + 1);

        // int byUsingParseInt = Integer.parseInt(str);

    }

    public static int convertToInteger(String s) {

        int result = 0;
        int factorTo10 = 1;

        for (int i = s.length() - 1; s.startsWith("-") ? i > 0 : i >= 0; i--) {

            result += (s.charAt(i) - '0') * factorTo10;
            factorTo10 *= 10;
        }
        return result;
    }

}

 /*
    write a program that can convert a string to integer. DO NOT use parse or valueOf methods
     */
