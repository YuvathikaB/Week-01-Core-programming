package level2;
import java.util.*;
public class UnitConvertor3 {
    public static double FToC(double ft){
        double cl=(ft - 32) * (5.0 / 9);
        return cl;
    }
    public static double CToF(double cl){
        double ft=(cl * 9.0 / 5) + 32;
        return ft;
    }
    public static double poundToKg(double pd){
        double kg=pd*0.453592;
        return kg;
    }
    public static double KgToPound(double kg){
        double pound=kg*2.20462;
        return pound;
    }
    public static double GallonToLiter(double gl){
        double lt=gl*3.78541;
        return lt;
    }
    public static double LiterToGallon(double lt){
        double gl=lt*0.264172;
        return gl;
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in fahrenheit : ");
        double ft = sc.nextDouble();
        System.out.println("The temperature in celsius : "+String.format("%.2f",FToC(ft)));
        System.out.println();
        System.out.print("Enter temperature in celsius : ");
        double cl = sc.nextDouble();
        System.out.println("The temperature in fahrenheit : "+String.format("%.2f",CToF(cl)));
        System.out.println();
        System.out.print("Enter weight in pounds : ");
        double pd= sc.nextDouble();
        System.out.println("The weight in kg : "+String.format("%.2f",poundToKg(pd)));
        System.out.println();
        System.out.print("Enter weight in kg : ");
        double kg= sc.nextDouble();
        System.out.println("The weight in pounds : "+String.format("%.2f",KgToPound(kg)));
        System.out.println();
        System.out.print("Enter quantity in gallons : ");
        double gl= sc.nextDouble();
        System.out.println("The quantity in liters : "+String.format("%.2f",GallonToLiter(gl)));
        System.out.println();
        System.out.print("Enter quantity in liters : ");
        double lt= sc.nextDouble();
        System.out.println("The quantity in gallons : "+String.format("%.2f",LiterToGallon(lt)));
    }
}
