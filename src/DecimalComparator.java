public class DecimalComparator {
    public static void main(String[] args) {
        boolean answer = areEqualByThreeDecimalPlaces(3.1756,3.175);

    }

    public static boolean  areEqualByThreeDecimalPlaces(double num1, double num2) {

        num1 *= 1000;
        num2 *= 1000;

        int new_num1 = (int) num1;
        int new_num2 = (int) num2;

        if (new_num1 == new_num2) {
            return true;
        }
        return false;
    }
}
