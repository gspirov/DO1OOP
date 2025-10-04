package calculator;

import java.util.Scanner;

public class Main {
    static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First number: ");
        int a = scanner.nextInt();

        System.out.println("Second number: ");
        int b = scanner.nextInt();

        System.out.println("Operation (could be 'a', 's', 'm', 'd'): ");
        char operation = scanner.next().charAt(0);

        double result;
        String operand;

        switch (operation) {
            case 'a':
                result = a + b;
                operand = "+";
                break;
            case 's':
                result = a - b;
                operand = "-";
                break;
            case 'm':
                result = a * b;
                operand = "*";
                break;
            case 'd':
                if (b == 0) throw new ArithmeticException("Division by zero.");
                result = (double) a / b;
                operand = "/";
                break;
            default:
                throw new Exception("Invalid operation.");
        }

        int resultInt = (int) result;

        if (result == resultInt) {
            System.out.println(a + " " + operand + " " + b + " = " + resultInt);
        } else {
            System.out.println(a + " " + operand + " " + b + " = " + result);
        }
    }
}