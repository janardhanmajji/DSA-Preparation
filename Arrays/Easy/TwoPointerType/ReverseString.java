package Arrays.Easy.TwoPointerType;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char c[] = s.toCharArray();
        reverseString(c);

        System.out.println(c);
        sc.close();
    }

    public static void reverseString(char[] s) {
        int n = s.length;
        int i = 0, j = n - 1;
        while (i < j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }
}
