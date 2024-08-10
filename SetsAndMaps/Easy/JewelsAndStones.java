package SetsAndMaps.Easy;

import java.util.*;

public class JewelsAndStones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String jewels = sc.next();
        String stones = sc.next();

        System.out.println(numJewelsInStones(jewels, stones));

        sc.close();
    }

    public static int numJewelsInStones(String jewels, String stones) {
        int m = jewels.length();
        int n = stones.length();

        Set<Character> jewel = new HashSet<>();

        for (int i = 0; i < m; i++) {
            jewel.add(jewels.charAt(i));
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (jewel.contains(stones.charAt(i))) {
                ans++;
            }
        }

        return ans;
    }
}
