
import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое целое число a:");
        int a = scanner.nextInt();

        System.out.print("Введите второе целое число b:");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        int sum = a + b;
        int difference = a - b;
        int division = a / b;
        int multiplication = a * b;

        System.out.println("Сумма a + b = " + sum);
        System.out.println("Разность a - b = " + difference);
        System.out.println("Деление a : b = " + division);
        System.out.println("Умножение a * b = " + multiplication);
        scanner.close();
    }
    }
