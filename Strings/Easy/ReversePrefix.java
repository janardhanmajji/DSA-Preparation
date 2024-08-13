package Strings.Easy;

import java.util.Scanner;

public class ReversePrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        char c = sc.next().charAt(0);

        System.out.println(reversePrefix(word, c));

        sc.close();
    }

    public static String reversePrefix(String word, char c) {
        char z[] = word.toCharArray();
        String ans = "";
        int count = 1;
        for (int i = 0; i < word.length(); i++) {
            ans += z[i];
            if (z[i] == c && count == 1) {
                ans = reverse(ans);
                count++;
            }
        }

        return ans;
    }

    public static String reverse(String s) {
        char c[] = s.toCharArray();
        int n = s.length();
        int start = 0, end = n - 1;
        while (start < end) {
            char temp = c[start];
            c[start] = c[end];
            c[end] = temp;
            start++;
            end--;
        }

        String ans = new String(c);
        return ans;
    }
}
