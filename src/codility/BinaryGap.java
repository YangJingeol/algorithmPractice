package codility;

public class BinaryGap {
    public static void main(String[] args) throws Exception{
        int problem = 32;
        if(problem < 0) {
            throw new Exception("lower than zero");
        }
        String binary = Integer.toBinaryString(problem);

        int result = 0;
        int count = 0;

        for(int i = 0 ; i < binary.length(); i++) {

            if(binary.charAt(i) == '0') {
                count++;
            } else {
                if(count > result) {
                    result = count;
                }
                count = 0;
            }
        }
        if(result == 0) {
            System.out.println("no gap");
        } else {
            System.out.println(result);
        }
    }
}
