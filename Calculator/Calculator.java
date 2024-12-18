package Calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanIn = new Scanner(System.in);
        System.out.print("Enter Number x: ");
        double x = scanIn.nextDouble();
        System.out.print("Enter Operation (+ - * / % ^): ");
        char operation = scanIn.next().charAt(0);
        System.out.print("Enter Number y: ");
        double y = scanIn.nextDouble();
        double result;
        switch (operation) {
            case '+':
                result = x + y;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = x - y;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = x * y;
                System.out.println("Result: " + result);
                break;
            case '/':
                if (y != 0) {
                    result = x / y;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Divison by zero is not allowed.");
                }
                break;
            case '%':
                if (y != 0) {
                    result = x % y;
                    System.out.println("Result:" + result);
                } else {
                    System.out.println("Error: Divison by zero is not allowed.");
                }
                break;
            case '^':
                result = Math.pow(x, y);
                System.out.println("Result: " + result);
                break;
            default:
                System.out.println("Error: Invalid operation.");
        }
        scanIn.close();
    }
}
