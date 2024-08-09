package Arrays.Easy;

import java.util.Scanner;

public class DifferenceOfSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println(differenceOfSum(a));

        sc.close();
    }

    public static int differenceOfSum(int[] nums) {
        int n = nums.length;
        if (n == 0)
            return 0;
        int eleSum = 0, digitSum = 0;
        for (int i = 0; i < n; i++) {
            eleSum += nums[i];

            int x = nums[i];
            while (x > 0) {
                digitSum += x % 10;
                x = x / 10;
            }
        }

        return Math.abs(digitSum - eleSum);
    }
}
