package UniqueNumbers;

import java.util.HashSet;
import java.util.Scanner;

public class UniqueNumbers {
    public static void main(String[] args) {
        Scanner scanIn = new Scanner(System.in);
        int[] numbers = new int[10];
        System.out.println("Enter 10 integers: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Integers " + (i + 1) + ": ");
            numbers[i] = scanIn.nextInt();
        }
        HashSet<Integer> uniqueNumbers = new HashSet<>();
        for (int number : numbers) {
            uniqueNumbers.add(number);
        }
        System.out.print("Unique numbers is: ");
        for (int number : uniqueNumbers) {
            System.out.print(number + " ");
        }
        scanIn.close();
    }
}
