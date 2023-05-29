import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        // Вывести все простые числа от 1 до 1000 (числа, которые делятся только на 1 и на себя без остатка)
        // простые числа, числа, которые делятся без остатка только на 1 и на самого себя

        System.out.println("input number: ");
        Scanner iScanner = new Scanner(System.in);
        int number = iScanner.nextInt();
        System.out.printf("number = %d \n", number);
        naturalNumbers(number);

    }

    static void naturalNumbers(int num){
        for (int i = 1; i <= num; i++) {
            if(i%2 != 0 && i%3!= 0 && i%5!=0 && i%7!=0 || i == 2 || i == 3 || i == 5 || i == 7 ){
                System.out.printf("%d ", i);

            }
        }
    }

}
