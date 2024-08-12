package Strings.Easy;

import java.util.*;

public class RankTransform {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] sol = arrayRankTransform(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(sol[i] + " ");
        }
        sc.close();
    }

    public static int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        int[] duplicate = Arrays.copyOf(arr, n);
        int rank = 1;
        Arrays.sort(duplicate);
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!mp.containsKey(duplicate[i])) {
                mp.put(duplicate[i], rank++);
            }
        }

        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = mp.get(arr[i]);
        }

        return ans;
    }
}
