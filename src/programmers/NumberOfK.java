package programmers;

import java.util.Arrays;

public class NumberOfK {

    private int[] solution(int[] array, int[][] commands) {
        int[] result = new int[commands.length];

        for(int i = 0 ; i < commands.length; i++) {
            int arrayLength = commands[i][1] - commands[i][0] + 1;
            int start = commands[i][0] - 1;
            int location = commands[i][2] - 1;

            Integer[] tempArray = new Integer[arrayLength];

            for(int j = 0 ; j < arrayLength; j++) {
                tempArray[j] = array[start];
                start++;
            }
            // reverse order
            //Arrays.sort(tempArray, Collections.reverseOrder());
            Arrays.sort(tempArray);

            result[i] = tempArray[location];
        }

        return result;
    }

    public static void main(String[] args) {
        NumberOfK numberOfK = new NumberOfK();
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] command = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        int[] sol = numberOfK.solution(array,command);
        for(int i = 0 ; i < sol.length; i++) {
            System.out.println(sol[i]);
        }
    }
}
