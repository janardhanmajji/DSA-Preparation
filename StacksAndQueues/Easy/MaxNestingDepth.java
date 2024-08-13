package StacksAndQueues.Easy;

import java.util.*;

public class MaxNestingDepth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(maxDepth(s));
        sc.close();
    }

    public static int maxDepth(String s) {
        int c = 0, max = 0;
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                st.push(s.charAt(i));
                c++;

                if (c > max)
                    max = c;
            } else if (s.charAt(i) == ')') {
                st.pop();
                c--;
            }
        }

        return max;
    }
}
