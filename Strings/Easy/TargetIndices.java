package Strings.Easy;

import java.util.*;

public class TargetIndices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        List<Integer> sol = targetIndices(nums, target);

        for (int x : sol) {
            System.out.print(x + " ");
        }
        sc.close();
    }

    public static List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> lt = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                lt.add(i);
            }
        }

        return lt;
    }
}
