package Java._01_Aug07;

import java.util.Scanner;

public class _3_IsANumberPrime {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            int n = scn.nextInt();
            if (checkPrime(n))
                System.out.println("prime");
            else
                System.out.println("not prime");
        }
        scn.close();
        // write ur code here

    }

    public static boolean checkPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

}
