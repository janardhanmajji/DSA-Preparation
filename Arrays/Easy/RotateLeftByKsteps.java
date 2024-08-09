package Arrays.Easy;

import java.util.Scanner;

public class RotateLeftByKsteps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int d = sc.nextInt();
        rotateArr(a, d, n);
        for(int i=0; i<n; i++){
            System.out.print(a[i]+" ");
        }
        sc.close();
    }

    public static void rotateArr(int arr[], int d, int n) {
        if (n == 0)
            return;
        d = d % n;
        while (d-- > 0) {
            int x = arr[0];
            for (int i = 0; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[n - 1] = x;
        }
    }

}
