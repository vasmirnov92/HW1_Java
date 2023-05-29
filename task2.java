import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {

        // написать программу, вычисляющую факториал числа

        System.out.println("input number: ");
        Scanner iScanner = new Scanner(System.in);
        int number = iScanner.nextInt();
        System.out.printf("number = %d\n", number);
        int factor = factorial(number);
        System.out.printf("factorial (%d) = %d\n", number, factor);

    }

    static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}
