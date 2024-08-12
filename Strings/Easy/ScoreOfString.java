package Strings.Easy;

import java.util.Scanner;

/**
 * ScoreOfString
 */
public class ScoreOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(scoreOfString(s));
        sc.close();
    }

    public static int scoreOfString(String s) {
        int n = s.length();
        int score = 0;
        for (int i = 0; i < n - 1; i++) {
            score += Math.abs(s.charAt(i) - s.charAt(i + 1));
        }

        return score;
    }
}