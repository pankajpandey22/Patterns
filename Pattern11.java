package Patterns;

import java.util.Scanner;

public class Pattern11 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            for (int j=i; j>0; j--) {
                System.out.print(j%2+" ");
            }
            System.out.println();
        }

        sc.close();
    }
}
