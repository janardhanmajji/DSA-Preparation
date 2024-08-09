package Arrays.Easy;

import java.util.Scanner;

public class RotateRightByK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        rotate(a, k);
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

        sc.close();
    }

    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        if (n == 0)
            return;
        k = k % n;
        while (k-- > 0) {
            int x = nums[n - 1];
            for (int i = n - 1; i > 0; i--) {
                nums[i] = nums[i - 1];
            }
            nums[0] = x;
        }
    }
}
