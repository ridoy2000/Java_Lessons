import java.text.DecimalFormat;

public class OverLoadedMethod {
    public static void main(String[] args){

        double getHeight = convertToCentimeters(5, 8);
        System.out.println(getHeight);

        double conversion =  convertToCentimeters(68);
        System.out.println(conversion);


    }

    public static double convertToCentimeters(int height_inches){

        return height_inches * 2.54;
    }

    public static double convertToCentimeters(int feet, int inches){

        //return convertToCentimeters((feet * 12) + inches);

        int feettoInches = feet * 12;
        int totalInches= feet + inches;
        double result = convertToCentimeters(totalInches);
        return result;

    }



}
