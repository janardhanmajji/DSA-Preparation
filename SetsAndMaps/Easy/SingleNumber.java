package SetsAndMaps.Easy;

import java.util.*;
import java.util.Scanner;

public class SingleNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println(singleNumber(a));

        sc.close();
    }

    public static int singleNumber(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            mp.put(nums[i], 1 + mp.getOrDefault(nums[i], 0));
        }
        int ans = 0;

        for (int x : mp.keySet()) {
            if (mp.get(x) == 1) {
                ans = x;
                break;
            }
        }
        return ans;
    }
}
