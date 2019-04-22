package codility;

public class CircleRotation {

    private static int[] problem(int[] problem, int shiftNumber) {
        int[] result = new int[problem.length];
        for(int i = 0 ; i < problem.length; i++) {
            result[(i + shiftNumber) % problem.length] = problem[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] answer = problem(new int[]{3, 8, 9, 7, 6}, 3);
        System.out.println(answer);
    }
}
