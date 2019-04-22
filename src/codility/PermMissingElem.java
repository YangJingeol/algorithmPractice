package codility;

import java.util.Arrays;

public class PermMissingElem {

    private static int permMissingElem(int[] problemArray) {
        Arrays.sort(problemArray);
        int result = problemArray.length+1;

        for(int i = 0; i < problemArray.length; i++) {
            if(problemArray[i] != i+1) {
               result = i+1;
               break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] problemArray = {2,3,1,5};
        System.out.println(permMissingElem(problemArray));
    }
}
