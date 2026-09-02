package Patterns;

import java.util.Scanner;

public class Pattern09 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            System.out.print("  ".repeat(n-i));
            System.out.println("* ".repeat(i*2-1));
        }

        for (int i=n; i>0; i--) {
            System.out.print("  ".repeat(n-i));
            System.out.println("* ".repeat(i*2-1));
        }


        sc.close();
    }
}
