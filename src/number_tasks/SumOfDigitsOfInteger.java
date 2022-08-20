package number_tasks;

public class SumOfDigitsOfInteger {

    public static void main(String[] args) {

        int n = 123;

        System.out.println(sumOfDigits(n));

    }

    public static int sumOfDigits(int num) {

        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num /= 10;

        }

        return sum;

    }
}
  /*
    write a function that can return the sum of digits of an integer Do not use any string manipulations
        Ex:
            input: 123
            output: 6

     */