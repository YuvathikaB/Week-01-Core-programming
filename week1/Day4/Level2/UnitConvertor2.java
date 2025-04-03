package level2;
import java.util.*;
public class UnitConvertor2 {
    public static double YardToFeet(double yard){
        double feet=yard*3;
        return feet;
    }
    public static double FeetToYard(double feet){
        double yard=feet*0.333333;
        return yard;
    }
    public static double MeterToInch(double mtr){
        double inch=mtr*39.3701;
        return inch;
    }
    public static double InchToMeter(double inch){
        double mtr=inch*0.0254;
        return mtr;
    }
    public static double InchToCm(double inch){
        double cm=inch*2.54;
        return cm;
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length in yards : ");
        double y = sc.nextDouble();
        System.out.println("The length in feet : "+String.format("%.2f",YardToFeet(y)));
        System.out.println();
        System.out.print("Enter length in feet : ");
        double ft = sc.nextDouble();
        System.out.println("The length in yards : "+String.format("%.2f",FeetToYard(ft)));
        System.out.println();
        System.out.print("Enter length in meters : ");
        double mr= sc.nextDouble();
        System.out.println("The length in inch : "+String.format("%.2f",MeterToInch(mr)));
        System.out.println();
        System.out.print("Enter length in inch : ");
        double inch= sc.nextDouble();
        System.out.println("The length in meters : "+String.format("%.2f",InchToMeter(inch)));
        System.out.println();
        System.out.print("Enter length in inch : ");
        double inches= sc.nextDouble();
        System.out.println("The length in centimeters : "+String.format("%.2f",InchToCm(inches)));
    }
}
