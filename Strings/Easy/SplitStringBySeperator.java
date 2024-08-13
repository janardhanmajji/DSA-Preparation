package Strings.Easy;

import java.util.*;

public class SplitStringBySeperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> lt = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            lt.add(sc.next());
        }

        char seperator = sc.next().charAt(0);

        List<String> sol = splitWordsBySeparator(lt, seperator);
        for (String x : sol) {
            System.out.print(x + " ");
        }
        sc.close();
    }

    public static List<String> splitWordsBySeparator(List<String> words, char separator) {
        int n = words.size();
        List<String> sol = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String word = words.get(i);
            // System.out.println(word);
            String sep = String.valueOf(separator);
            // System.out.println(sep);
            String[] ans = word.split(sep);
            System.out.println(ans.length);
            for (int j = 0; j < ans.length; j++) {
                System.out.println(ans[j]);
                sol.add(ans[j]);
            }
        }

        return sol;
    }
}
