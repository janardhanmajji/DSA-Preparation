package Strings.Easy;

import java.util.Scanner;

public class StringArraysEquivalent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        String[] word1 = new String[m];
        int n = sc.nextInt();
        String[] word2 = new String[n];
        for (int i = 0; i < m; i++) {
            word1[i] = sc.next();
        }

        for (int i = 0; i < n; i++) {
            word2[i] = sc.next();
        }

        System.out.println(arrayStringsAreEqual(word1, word2));

        sc.close();
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int m = word1.length;
        int n = word2.length;

        String s1 = "", s2 = "";
        for (int i = 0; i < m; i++) {
            s1 += word1[i];
        }
        for (int j = 0; j < n; j++) {
            s2 += word2[j];
        }

        System.out.println(s1);
        System.out.println(s2);
        if (s1.equals(s2))
            return true;
        else
            return false;
    }
}
