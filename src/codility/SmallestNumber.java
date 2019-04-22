package codility;

import java.util.HashSet;
import java.util.Set;

public class SmallestNumber {

    private static int number(int[] problem) {
        Set<Integer> problemSet = new HashSet<>();
        for(int i : problem) {
            if(i > 0) {
                problemSet.add(i);
            }

        }

        for (int i = 1; i <= problem.length + 1; i++) {
            if (!problemSet.contains(i)) {
                return i;
            }
        }

        return 1;
    }

    public static void main(String[] args) {
        int [] problem = {1, 3, 6, 4, 1, 2};
        //{1 1 2 3 4 6}
        System.out.println(number(problem));
    }
}
