package Arrays.Easy.TwoPointerType;

import java.util.*;

public class ReverseVowelsOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        System.out.println(reverseVowels(s));

        sc.close();
    }

    public static String reverseVowels(String s) {
        char c[] = s.toCharArray();
        int n = c.length;
        if (n == 0 || n == 1)
            return s;
        int i = 0, j = n - 1;
        Set<Character> st = new HashSet<>();
        st.add('a');
        st.add('e');
        st.add('i');
        st.add('o');
        st.add('u');

        while (i < j) {
            if (!st.contains(c[i]))
                i++;
            if (!st.contains(c[j]))
                j--;
            if (st.contains(c[i]) && st.contains(c[j])) {
                char temp = c[i];
                c[i] = c[j];
                c[j] = temp;
                i++;
                j--;
            }
        }

        String ans = new String(c);
        return ans;
    }
}
