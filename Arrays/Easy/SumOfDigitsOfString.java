package Arrays.Easy;

import java.util.Scanner;

public class SumOfDigitsOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int k = sc.nextInt();

        System.out.println(getLucky(s, k));
        sc.close();
    }

    public static int getLucky(String s, int k) {
        String sol = "";
        for (int i = 0; i < s.length(); i++) {
            int x = s.charAt(i) - 96;
            sol += x;
        }

        while (k-- > 0) {
            sol = transform(sol);
        }

        return Integer.parseInt(sol);
    }

    public static String transform(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += (s.charAt(i) - '0');
        }
        return String.valueOf(sum);
    }
}
