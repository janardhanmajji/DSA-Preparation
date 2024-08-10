package SetsAndMaps.Easy;

import java.util.*;

public class FindTheDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String t = sc.next();

        System.out.println(findTheDifference(s, t));

        sc.close();
    }

    public static char findTheDifference(String s, String t) {
        int m = s.length();
        int n = t.length();

        char c1[] = s.toCharArray();
        char c2[] = t.toCharArray();

        Set<Character> st = new HashSet<>();
        for (int i = 0; i < m; i++) {
            st.add(c1[i]);
        }

        for (int i = 0; i < n; i++) {
            if (!st.contains(c2[i])) {
                return c2[i];
            }
        }

        return ' ';
    }
}
