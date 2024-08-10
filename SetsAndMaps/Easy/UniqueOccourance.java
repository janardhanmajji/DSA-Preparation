package SetsAndMaps.Easy;

import java.util.*;

public class UniqueOccourance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println(uniqueOccurrences(a));
        sc.close();
    }

    public static boolean uniqueOccurrences(int[] arr) {
        int n = arr.length;
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            mp.put(arr[i], 1 + mp.getOrDefault(arr[i], 0));
        }

        Set<Integer> valueSet = new HashSet<>();
        for (int x : mp.keySet()) {
            valueSet.add(mp.get(x));
        }

        if (mp.size() == valueSet.size())
            return true;
        else
            return false;
    }
}
