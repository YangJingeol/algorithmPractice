package codility;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class Distinct {

    public int solution(int[] A) {

        Set<Integer> arrSet = new HashSet<>();

        for(int i : A) {
            arrSet.add(i);
        }

        return arrSet.size();
    }


    @Test
    public void solutionTest() {
        Distinct distinct = new Distinct();
        int[] arr = {2,1,1,2,3,1};
        System.out.println(distinct.solution(arr));
    }
}
