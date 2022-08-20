package number_tasks;

public class SumAllDigitsUntilOneDigit {

    public static void main(String[] args) {

        sumAllUntilOneDigit(45659);
    }

    public static void sumAllUntilOneDigit(int n) {

        do {
            int sum = 0;
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
            n = sum;

            System.out.println(sum);

        } while (n >= 10);


    }
}
  /*
    Sum all digits of a number until you have one digit number
    EX:
        input: 45659
        output:
                29
                11
                2
        Explanation:
                4+5+6+5+9=29
                2+9=11
                1+1=2
     */