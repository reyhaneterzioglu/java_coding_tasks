package number_tasks;

public class SwapTwoNumbers {

    public static void main(String[] args) {

        int num1 = 8, num2 = 7;

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

    }
}
/*
    Swap two variables' values without using a third variable
     */