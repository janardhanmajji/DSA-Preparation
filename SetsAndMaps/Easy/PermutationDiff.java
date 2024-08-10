package SetsAndMaps.Easy;

import java.util.*;

public class PermutationDiff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        System.out.println(findPermutationDifference(s, t));
        sc.close();
    }

    public static int findPermutationDifference(String s, String t) {
        int m = s.length();
        int n = t.length();

        char[] c1 = s.toCharArray();
        char[] c2 = t.toCharArray();

        Map<Character, Integer> mp1 = new HashMap<>();
        Map<Character, Integer> mp2 = new HashMap<>();

        for (int i = 0; i < m; i++) {
            mp1.put(c1[i], i);
        }

        for (int i = 0; i < n; i++) {
            mp2.put(c2[i], i);
        }

        int sum = 0;
        for (int i = 0; i < m; i++) {
            sum += Math.abs(mp1.get(c1[i]) - mp2.get(c1[i]));
        }
        return sum;

    }
}
