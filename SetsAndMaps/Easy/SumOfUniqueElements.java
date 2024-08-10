package SetsAndMaps.Easy;

import java.util.*;

public class SumOfUniqueElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println(SumOfUnique(a));
        sc.close();
    }

    public static int SumOfUnique(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            mp.put(nums[i], 1 + mp.getOrDefault(nums[i], 0));
        }

        int s = 0;
        for (int i = 0; i < n; i++) {
            if (mp.get(nums[i]) == 1) {
                s += nums[i];
            }
        }

        return s;
    }
}
