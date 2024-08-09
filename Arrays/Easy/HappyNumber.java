package Arrays.Easy;

import java.util.Scanner;

public class HappyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(isHappy(n));

        sc.close();
    }

    public static boolean isHappy(int n) {
        long ans = sumOfSquare(n);
        int flag = 0;
        while (ans != 4 || ans != 1) {
            ans = sumOfSquare(ans);
            System.out.println(ans);
            if (ans == 4) {
                flag = 1;
                break;
            } else if (ans == 1) {
                break;
            }
        }

        if (flag == 1)
            return false;
        else
            return true;
    }

    public static long sumOfSquare(long n) {
        long s = 0;
        while (n > 0) {
            long r = n % 10;
            s += r * r;
            n = n / 10;
        }

        return s;
    }
}
