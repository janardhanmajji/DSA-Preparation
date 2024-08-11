package SetsAndMaps.Easy;

import java.util.*;

public class CheckEqualOccourance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        System.out.println(areOccurrencesEqual(s));

        sc.close();
    }

    public static boolean areOccurrencesEqual(String s) {
        Map<Character, Integer> mp = new HashMap<>();
        char[] c = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            mp.put(c[i], 1 + mp.getOrDefault(c[i], 0));
        }

        Set<Integer> st = new HashSet<>();
        for (char x : mp.keySet()) {
            st.add(mp.get(x));
        }

        if (st.size() == 1)
            return true;
        else
            return false;

    }
}
