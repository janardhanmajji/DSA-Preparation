package Strings.Easy;

import java.util.Scanner;

public class MaxWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] sentences = new String[n];

        for (int i = 0; i < sentences.length; i++) {
            sentences[i] = sc.nextLine();
        }

        System.out.println(mostWordsFound(sentences));
        sc.close();
    }

    public static int mostWordsFound(String[] sentences) {
        int max = 0;
        for (int i = 0; i < sentences.length; i++) {
            String sentence = sentences[i];
            String[] words = sentence.split(" ");
            if (words.length > max)
                max = words.length;
        }
        return max;
    }
}
