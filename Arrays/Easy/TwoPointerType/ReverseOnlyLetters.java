package Arrays.Easy.TwoPointerType;

import java.util.*;

public class ReverseOnlyLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(reverseOnlyLetters(s));

        sc.close();
    }

    public static String reverseOnlyLetters(String s) {
        int n = s.length();
        if (n == 0 || n == 1)
            return s;
        Set<Character> st = new HashSet<>();
        for (char i = 'a'; i <= 'z'; i++) {
            st.add(i);
        }
        for (char i = 'A'; i <= 'Z'; i++) {
            st.add(i);
        }

        char[] c = s.toCharArray();

        int i = 0, j = n - 1;
        while (i < j) {
            if (!st.contains(c[i]))
                i++;
            if (!st.contains(c[j]))
                j--;
            if (st.contains(c[i]) && st.contains(c[j])) {
                char x = c[i];
                c[i] = c[j];
                c[j] = x;
                i++;
                j--;
            }

        }
        String ans = new String(c);
        return ans;

    }
}
