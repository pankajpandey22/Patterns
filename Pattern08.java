package Patterns;

import java.util.Scanner;

public class Pattern08 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=n; i>0; i--) {
            System.out.print("  ".repeat(n-i));
            System.out.println("* ".repeat(i*2-1));
        }

        sc.close();
    }
}
