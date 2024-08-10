// package SetsAndMaps.Easy;

// import java.util.*;

// public class SortThePeople {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         String names = sc.next();
//         String 
//     }

//     public static String[] sortPeople(String[] names, int[] heights) {
//         int n = names.length;
//         Map<Integer, String> mp = new HashMap<>();
//         for (int i = 0; i < n; i++) {
//             mp.put(heights[i], names[i]);
//         }

//         Arrays.sort(heights);

//         String[] sol = new String[n];

//         for (int i = 0; i < n; i++) {
//             sol[i] = mp.get(heights[n - i - 1]);
//         }

//         return sol;

//     }
// }
