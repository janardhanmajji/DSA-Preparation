package Arrays.Easy;

import java.util.Scanner;

public class AddDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        System.out.println(addDigits(num));

        sc.close();

    }

    public static int addDigits(int num) {
        while (num % 10 != num) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num = num / 10;
            }
            num = sum;
        }
        return num;
    }
}
