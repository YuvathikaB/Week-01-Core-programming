import java.util.Scanner;
public class Youngest{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Amar's age: ");
        int  amarAge= input.nextInt();
        System.out.print("Enter Amar's height: ");
        int amarHeight = input.nextInt();
		System.out.print("Enter Akbar's age: ");
        int  akbarAge= input.nextInt();
        System.out.print("Enter Akbar's height: ");
        int akbarHeight = input.nextInt();
		System.out.print("Enter Anthony's age: ");
        int  anthonyAge= input.nextInt();
        System.out.print("Enter Anthony's height: ");
        int anthonyHeight = input.nextInt();
		String youngest;
		if (amarAge<=akbarAge && amarAge<=anthonyAge){
			youngest="Amar";
		} else if (akbarAge<=amarAge && akbarAge<=anthonyAge){
		    youngest="Akbar";
		} else{
			youngest="Anthony";
		}
		String tallest;
		if (amarHeight>=akbarHeight && amarHeight>=anthonyHeight){
			tallest="Amar";
		}else if (akbarHeight>=amarHeight && akbarHeight>=anthonyHeight){
			tallest="Akbar";
		}else {
			tallest="Anthony";
		}
		System.out.println("The youngest friend is: "+youngest);
		System.out.println("The tallest friend is: "+tallest);
    }
}