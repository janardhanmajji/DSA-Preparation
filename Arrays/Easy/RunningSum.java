package Arrays.Easy;

import java.util.Scanner;

public class RunningSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int sol[] = runningSum(a);
        for (int i = 0; i < n; i++) {
            System.out.print(sol[i] + " ");
        }
        sc.close();
    }

    public static int[] runningSum(int[] nums) {
        int n = nums.length;
        if (n == 0 || n == 1)
            return nums;
        int s = 0;
        for (int i = 0; i < n; i++) {
            s = s + nums[i];
            nums[i] = s;
        }

        return nums;
    }
}