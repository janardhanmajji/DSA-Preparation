package Strings.Easy;

import java.util.Scanner;

public class BalancedStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println(balancedStringSplit(s));
        sc.close();
    }

    public static int balancedStringSplit(String s) {
        char c[] = s.toCharArray();
        int rCount = 0, lCount = 0, ans = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] == 'R')
                rCount++;
            else
                lCount++;

            if (rCount == lCount) {
                ans++;
                rCount = 0;
                lCount = 0;
            }
        }

        return ans;
    }
}
