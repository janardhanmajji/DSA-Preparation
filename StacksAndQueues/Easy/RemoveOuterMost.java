package StacksAndQueues.Easy;

import java.util.*;

public class RemoveOuterMost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(removeOuterParentheses(s));
        sc.close();
    }

    public static String removeOuterParentheses(String s) {
        Stack<Character> st = new Stack<>();
        String ans = "";
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                st.push(s.charAt(i));
            }

            else if (s.charAt(i) == ')' && st.peek() == '(') {
                st.push(s.charAt(i));
            }

            else if (s.charAt(i) == ')' && st.peek() == ')') {
                i++;
            }
        }

        while (!st.isEmpty()) {
            ans += st.pop();
        }

        StringBuilder sb = new StringBuilder(ans);
        sb.reverse();

        return sb.toString();
    }
}
