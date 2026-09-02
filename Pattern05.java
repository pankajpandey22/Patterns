package Patterns;

import java.util.Scanner;

public class Pattern05 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=n; i>0; i--) {
            System.out.println("* ".repeat(i));
        }

        sc.close();
    }
}
