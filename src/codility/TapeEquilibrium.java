package codility;

public class TapeEquilibrium {

    Object aa = new Object();
    private static int tape(int[] problemArray){
        int result = 0;
        int cal ;
        int temp = 0;
        for(int i = 0 ; i < problemArray.length; i++) {
            temp = temp + problemArray[i];
            int temp2 = 0;

            for(int j = i+1 ; j < problemArray.length; j++) {
                temp2 = temp2 + problemArray[j];
            }
            cal = temp - temp2;
            if(cal < 0) {
                cal = cal * -1;
            }

            if(i == 0) {
                result = cal;
            }

            if(result > cal) {
                result = cal;
            }
        }


        return result;
    }

    public static void main(String[] args) {
        TapeEquilibrium aa = new TapeEquilibrium();
        System.out.println(aa.toString());
//        int[] problem = {3,1,2,4,3};
//        System.out.println(tape(problem));
    }
}
