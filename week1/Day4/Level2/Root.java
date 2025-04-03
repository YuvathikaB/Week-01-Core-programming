package level2;
import java.util.*;
public class Root {
    public static void roots(double a,double b,double c){
        double delta=Math.pow(b,2)-4*a*c;
        if (delta>0){
            double r1=(-b+Math.sqrt(delta))/(2*a);
            double r2=(-b-Math.sqrt(delta))/(2*a);
            System.out.println("Root 1 = " + r1);
            System.out.println("Root 2 = " + r2);
        } else if (delta == 0) {
            double r=-b/(2*a);
            System.out.println("Root = " + r);
        }else{
            System.out.println("No real roots.");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter value of b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter value of c: ");
        double c = scanner.nextDouble();
        roots(a,b,c);
        scanner.close();
    }
}

