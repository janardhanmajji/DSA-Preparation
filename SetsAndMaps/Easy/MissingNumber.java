package SetsAndMaps.Easy;

import java.util.Scanner;
import java.util.*;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println(missingNumber(a));

        sc.close();
    }

    public static int missingNumber(int[] nums) {
        int n = nums.length;
        Set<Integer> st = new HashSet<>();

        for (int i = 0; i < n; i++) {
            st.add(nums[i]);
        }

        int ans = 0;

        for (int i = 0; i <= n; i++) {
            if (!st.contains(i)) {
                ans = i;
                break;
            }
        }

        return ans;
    }
}
