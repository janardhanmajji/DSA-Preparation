package Strings.Easy;

import java.util.Scanner;

public class FinalValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] ops = new String[n];
        for (int i = 0; i < ops.length; i++) {
            ops[i] = sc.next();
        }

        System.out.println(finalValueAfterOperations(ops));

        sc.close();
    }

    public static int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (int i = 0; i < operations.length; i++) {
            char c = operations[i].charAt(1);
            if (c == '+')
                x++;
            else
                x--;
        }

        return x;
    }
}
