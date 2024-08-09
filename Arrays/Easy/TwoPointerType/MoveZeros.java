package Arrays.Easy.TwoPointerType;

import java.util.Scanner;

public class MoveZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        moveZeros(a);
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

        sc.close();
    }

    public static void moveZeros(int[] nums) {
        int n = nums.length;
        if (n == 0)
            return;
        int i = 0;
        for (int j = 1; j < n; j++) {
            if (nums[i] != 0)
                i++;
            else if (nums[i] == 0 && nums[j] != 0) {
                nums[i] = nums[j];
                nums[j] = 0;
                i++;
            }
        }
    }
}
