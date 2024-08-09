package Arrays.Easy.TwoPointerType;

import java.util.*;

public class RemoveDuplicatesSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println(removeDuplicates(a));
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

        sc.close();
    }

    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n == 0 || n == 1)
            return n;
        int i = 0;
        for (int j = 1; j < n; j++) {
            if (nums[j] != nums[i] && j - i > 1) {
                nums[i + 1] = nums[j];
                i++;
            }
        }

        return i + 1;
    }
}
