package Strings.Easy;

import java.util.Scanner;

public class GoalParser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String command = sc.next();
        System.out.println(interpret(command));
        sc.close();
    }

    public static String interpret(String command) {
        int n = command.length();
        String ans = "";
        for (int i = 0; i < n; i++) {
            if (command.charAt(i) == '(' && command.charAt(i + 1) == ')') {
                ans += "o";
                i++;
            } else if (command.charAt(i) == '(' && command.charAt(i + 1) == 'a') {
                ans += "al";
                i = i + 3;
            } else {
                ans += command.charAt(i);
            }
        }

        return ans;
    }
}
