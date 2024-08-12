package Strings.Easy;

import java.util.Scanner;

public class RemoveVowelFromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(removeVowels(s));
        sc.close();
    }

    public static String removeVowels(String s) {
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != 'a' && s.charAt(i) != 'e' && s.charAt(i) != 'i' && s.charAt(i) != 'o'
                    && s.charAt(i) != 'u') {
                ans += s.charAt(i);
            }
        }

        return ans;
    }
}
