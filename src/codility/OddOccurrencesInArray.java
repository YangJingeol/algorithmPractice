package codility;

import java.util.HashSet;
import java.util.Set;

public class OddOccurrencesInArray {
    private static int solve(int[] problemArray) {
        Set<Integer> problemSet = new HashSet<>();

        for (int number : problemArray) {
            if (!problemSet.contains(number)) {
                problemSet.add(number);
            } else {
                problemSet.remove(number);
            }
        }
        return problemSet.iterator().next();
    }

    public static void main(String[] args) {
        int[] aa = {9, 3 ,9, 3 ,9 ,7 ,9};

        System.out.println(solve(aa));

    }
}
