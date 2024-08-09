package Arrays.Easy;

import java.util.Scanner;

public class UglyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(isUgly(n));
        sc.close();
    }

    public static boolean isUgly(int n) {
        if (n <= 0)
            return false;
        int flag = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && isPrime(i) == true && i >= 7) {
                flag = 1;
                break;
            }
        }

        if (flag == 1)
            return false;
        else
            return true;
    }

    public static boolean isPrime(int n) {
        int c = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0)
                c++;
        }

        if (c == 1)
            return true;
        else
            return false;
    }
}
