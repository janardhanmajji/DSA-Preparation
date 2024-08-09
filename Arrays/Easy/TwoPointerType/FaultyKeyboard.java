package Arrays.Easy.TwoPointerType;

import java.util.*;

public class FaultyKeyboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(finalString(s));
        sc.close();
    }

    public static String finalString(String s) {
        int n = s.length();
        if (n == 0 || n == 1)
            return s;
        String ans = "";
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != 'i') {
                ans += s.charAt(i);
            } else {
                ans = reverse(ans);
            }
        }

        return ans;
    }

    public static String reverse(String ans) {
        int n = ans.length();
        if (n == 0 || n == 1)
            return ans;
        char[] c = ans.toCharArray();
        int i = 0, j = n - 1;
        while (i < j) {
            char temp = c[i];
            c[i] = c[j];
            c[j] = temp;
            i++;
            j--;
        }

        String sol = new String(c);
        return sol;
    }
}
