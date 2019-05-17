package codility;


import java.util.Arrays;

public class GenomicRangeQuery {
    public int[] solution(String S, int[] P, int[] Q) {
        int[] stringToIntArr = stringToIntArr(S);
        int[] result = new int[P.length];

        for(int i = 0; i < S.length(); i++) {
            int num;
            switch (S.charAt(i)) {
                case 'A' : num = 1; break;
                case 'C' : num = 2; break;
                case 'G' : num = 3; break;
                default : num = 4;
            }
            stringToIntArr[i] = num;
        }


        for(int i = 0; i < P.length; i++) {
            int[] temp = new int[Q[i] - P[i] + 1];
            for(int j = 0 ; j < temp.length; j++) {
                temp[j] = stringToIntArr[P[i] + j];
            }
            Arrays.sort(temp);
            result[i] = temp[0];
        }
        return result;
    }


    public int[] solution2(String S, int[] P, int[] Q) {
        int[] stringToIntArr = stringToIntArr(S);
        int[] result = new int[P.length];
        for(int i = 0; i < P.length; i++) {
            int[] temp = new int[Q[i] - P[i] + 1];
            int min = 0;
            for(int j = 0 ; j < temp.length; j++) {
                if(j == 0) {
                    min = stringToIntArr[P[i] + j];
                }

                if(min > stringToIntArr[P[i] + j]) {
                    min = stringToIntArr[P[i] + j];
                }
            }
            result[i] = min;
        }

        return result;
    }

    public int[] stringToIntArr(String str) {
        int[] stringToIntArr = new int[str.length()];
        for(int i = 0; i < str.length(); i++) {
            int num;
            switch (str.charAt(i)) {
                case 'A' : num = 1; break;
                case 'C' : num = 2; break;
                case 'G' : num = 3; break;
                default : num = 4;
            }
            stringToIntArr[i] = num;
        }
        return stringToIntArr;
    }

    public int[] solution3(String S, int[] P, int[] Q){
        int[] result = new int[P.length];
        for(int i = 0; i < result.length; i++) {
            String subString = S.substring(P[i], Q[i]+1);
            int min = 0;
            for(int j = 0; j < subString.length(); j++) {
                int num = getScore(subString.charAt(j));
                if(j == 0) {
                    min = num;
                }
                if(min > num) {
                    min = num;
                }
            }
            result[i] = min;
        }
        return result;
    }

    public int getScore(char letter) {
        int num;
        switch (letter) {
            case 'A' : num = 1; break;
            case 'C' : num = 2; break;
            case 'G' : num = 3; break;
            default : num = 4;
        }
        return num;
    }


    public static void main(String[] args) {
        GenomicRangeQuery genomicRangeQuery = new GenomicRangeQuery();
        String str = "CAGCCTA";
        int[] p = {2, 5, 0};
        int[] q = {4, 5, 6};
        int[] result = genomicRangeQuery.solution3(str, p, q);

        for(int i = 0 ; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
