package level2;
import java.util.*;
public class UnitConvertor {
    public static double KmToMile(double km){
        double mile=km*0.621371;
        return mile;
    }
    public static double MileToKm(double m){
        double km=m*1.60934;
        return km;
    }
    public static double MeterToFeet(double mtr){
        double feet=mtr*3.28084;
        return feet;
    }
    public static double FeetToMeter(double feet){
        double mtr=feet*0.3048;
        return mtr;
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in km : ");
        double k = sc.nextInt();
        System.out.println("The distance in miles : "+String.format("%.2f",KmToMile(k)));
        System.out.println();
        System.out.print("Enter distance in miles : ");
        double ml = sc.nextInt();
        System.out.println("The distance in kilometers : "+String.format("%.2f",MileToKm(ml)));
        System.out.println();
        System.out.print("Enter length in meters : ");
        double mr= sc.nextInt();
        System.out.println("The length in feet : "+String.format("%.2f",MeterToFeet(mr)));
        System.out.println();
        System.out.print("Enter length in feet : ");
        double ft= sc.nextInt();
        System.out.println("The length in meters : "+String.format("%.2f",FeetToMeter(ft)));
    }
}
