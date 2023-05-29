import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        // Реализовать простой калькулятор 
        // (введите первое число, введите второе число, введите требуемую операцию, ответ)
        System.out.println("input first number: ");
        Scanner iScanner = new Scanner(System.in);              // инициализация сканнера должна быть один раз
        double a = iScanner.nextDouble();
        System.out.printf("a = %.2f\n", a);

        System.out.println("input second number: ");
       // Scanner iScanner = new Scanner(System.in);            // то есть эта строчка лишняя
        double b = iScanner.nextDouble();
        System.out.printf("b = %.2f\n", b);

        System.out.println("input Math action");
        String oper = iScanner.next();
        System.out.println(oper);

        double result = calculator(a, b, oper);
        System.out.println(result);



    }
    static double calculator(double x, double y, String operation){
        double res = 0;
        switch (operation) {
            case "+":
                res = x+y;
                break;
            case "-":
                res = x-y;
                break;
            case "*":
                res = x*y;
                break;
            case "/":
                res = x/y;
                break;
            default:
                break;
        }
        return res;
    }
    

}
