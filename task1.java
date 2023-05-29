import java.util.Scanner;

/**
Вычислить n-ое треугольного число (сумма чисел от 1 до n)
 */
public class task1 {
    public static void main(String[] args) {

        // Вычислить n-ое треугольного число (сумма чисел от 1 до n)

        System.out.println("input number:");
        Scanner iScanner = new Scanner(System.in);
        int number = iScanner.nextInt();
        System.out.printf("number = %d\n", number);
        int tri = triangleNumber(number);
        System.out.printf("triangle number = %d\n", tri);

    }

    static int triangleNumber(int num) {
        int triangle = 0;
        for (int i = 0; i <= num; i++) {
            triangle = triangle + i;
        }
        return triangle;
    }

}