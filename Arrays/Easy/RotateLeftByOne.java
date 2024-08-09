package Arrays.Easy;

import java.util.Scanner;

public class RotateLeftByOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int sol[] = rotateArray(a, n);
        for (int i = 0; i < n; i++) {
            System.out.print(sol[i] + " ");
        }

        sc.close();
    }

    public static int[] rotateArray(int[] arr, int n) {
        if (n == 0 || n == 1)
            return arr;
        int x = arr[0];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[n - 1] = x;
        return arr;
    }
}
