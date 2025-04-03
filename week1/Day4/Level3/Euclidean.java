package level3;
import java.util.*;
public class Euclidean {
    public static double distance(double x1, double y1, double x2, double y2){
        return Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
    }
    public static String equation(double x1, double y1, double x2, double y2){
        if(x1==x2) return "x= "+x1;
        double m=(y2-y1)/(x2-x1);  //m,b = Math.round(m * 100.0) / 100.0;

        double b=y1-(m*x1);
        return "y = "+m+"x + "+b;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter x1 and y1 : ");
        double x1=sc.nextDouble(),y1=sc.nextDouble();
        System.out.println("Enter x2 and y2 : ");
        double x2=sc.nextDouble(),y2=sc.nextDouble();
        System.out.println("Euclidean distance : "+String.format("%.2f",distance(x1,y1,x2,y2)));
        System.out.println("Equation : "+equation(x1,y1,x2,y2));
    }
}
