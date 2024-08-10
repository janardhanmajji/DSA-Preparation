package SetsAndMaps.Easy;

import java.util.*;

public class NoOfGoodPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println(numIdenticalPairs(a));

        sc.close();
    }

    public static int numIdenticalPairs(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            mp.put(nums[i], 1 + mp.getOrDefault(nums[i], 0));
        }

        int ans = 0;
        for (int x : mp.keySet()) {
            int a = mp.get(x);
            ans += (a * (a - 1)) / 2;
        }

        return ans;
    }
}
