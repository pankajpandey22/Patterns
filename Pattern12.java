package Patterns;

import java.util.Scanner;

public class Pattern12 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print(j+" ");
            }
            System.out.print("  ".repeat((n-i)*2));
            for (int j=i; j>0; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        sc.close();
    }
}
