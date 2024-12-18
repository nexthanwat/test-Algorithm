package StarPatterns;

import java.util.Scanner;

public class StarPatterns {
    public static void main(String[] args) {
        Scanner scanIn = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = scanIn.nextInt();
        System.out.println("Pattern 2.1:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("* ");
            }
            System.out.println();
            System.out.println();
            System.out.println("Pattern 2.2:");
            for (int t  = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (i == 0 || i == N - 1 || j == 0 || j == N - 1) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
            scanIn.close();
        }
    }
}
