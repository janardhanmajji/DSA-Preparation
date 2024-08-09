package Arrays.Easy;

import java.util.*;

public class MaxSumWithKEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        System.out.println(maximizeSum(a, k));
        // for (int i = 0; i < n; i++) {
        //     System.out.print(a[i] + " ");
        // }
        sc.close();
    }

    public static int maximizeSum(int[] nums, int k) {
        int n = nums.length;
        if (n == 0)
            return 0;

        Arrays.sort(nums);
        int ans = 0;

        while (k-- > 0) {
            ans += nums[n - 1];
            nums[n - 1]++;
        }

        return ans;

    }
}
