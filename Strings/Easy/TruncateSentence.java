package Strings.Easy;

import java.util.Scanner;

public class TruncateSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int k = sc.nextInt();
        System.out.println(truncateSentence(s, k));
        sc.close();
    }

    public static String truncateSentence(String s, int k) {
        String[] ans = s.split(" ");
        System.out.println(ans.length);
        String sol = "";
        for (int i = 0; i < k; i++) {
            sol += ans[i];
            sol += " ";
        }
        return sol;
    }
}
