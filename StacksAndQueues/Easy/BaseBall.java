package StacksAndQueues.Easy;

import java.util.*;

public class BaseBall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] ops = new String[n];
        for (int i = 0; i < n; i++) {
            ops[i] = sc.next();
        }

        System.out.println(calPoints(ops));

        sc.close();
    }

    public static int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < operations.length; i++) {
            if (!operations[i].equals("+") && !operations[i].equals("C") && !operations[i].equals("D")) {
                int x = Integer.valueOf(operations[i]);
                // System.out.println(x);
                st.push(x);
            } else if (operations[i].equals("D")) {
                int temp = st.peek();
                st.push(2 * temp);
                System.out.println(st.peek());
            } else if (operations[i].equals("C")) {
                st.pop();
            } else if (operations[i].equals("+")) {
                int a = st.pop();
                int b = st.pop();
                int c = a + b;
                st.push(a);
                st.push(b);
                st.push(c);
                System.out.println(c);
            }

            // System.out.println(st.size());
        }

        System.out.println(st.size());
        int sol = 0;
        while (!st.isEmpty()) {
            System.out.println(st.pop());
        }

        return sol;
    }
}
