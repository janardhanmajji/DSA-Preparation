package Strings.Easy;

import java.util.*;

public class FindWordsContainingChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] words = new String[n];
        for (int i = 0; i < words.length; i++) {
            words[i] = sc.next();
        }

        char x = sc.next().charAt(0);

        List<Integer> sol = findWordsContaining(words, x);

        for (int z : sol) {
            System.out.print(z + " ");
        }

        sc.close();
    }

    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> lt = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(j) == x) {
                    lt.add(i);
                    break;
                }
            }
        }

        return lt;
    }
}
