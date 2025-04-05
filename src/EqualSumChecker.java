public class EqualSumChecker {
    public static void main(String[] args) {
        boolean answer = hasEqualSum(3,5,8);
        System.out.println(answer);
    }

    public static boolean hasEqualSum(int num1, int num2, int num3){

        int result = num1 + num2;

        if(result == num3){
            return true;
        }

        return false;

    }


}
