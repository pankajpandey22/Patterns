package Patterns;

import java.util.Scanner;

public class Pattern15 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            System.out.print("  ".repeat(n-i)+"* ");
            System.out.print("  ".repeat(i-1));
            if (i-1 > 0) {
                System.out.print("  ".repeat(i-2)+"* ");
            }
            System.out.println();
        }

        for (int i=n-1; i>0; i--) {
            System.out.print("  ".repeat(n-i)+"* ");
            System.out.print("  ".repeat(i-1));
            if (i-1 > 0) {
                System.out.print("  ".repeat(i-2)+"* ");
            }
            System.out.println();
        }

        sc.close();
    }
}
