import java.util.Scanner;
public class Travel{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name= input.nextLine();
		System.out.print("Enter from city: ");
		String fromCity= input.nextLine();
		System.out.print("Enter via city: ");
		String viaCity= input.nextLine();
		System.out.print("Enter destination city: ");
		String toCity= input.nextLine();
		System.out.print("Enter distance between from city to via city: ");
		double distanceFromToVia= input.nextDouble();
		System.out.print("Enter time taken to travel from city to via city in minutes: ");
		int timeFromToVia= input.nextInt();
		System.out.print("Enter distance between via city to final city: ");
		double distanceViaToFinal= input.nextDouble();
		System.out.print("Enter time taken to travel from via to final city in minutes: ");
		int timeViaToFinal= input.nextInt();
		double totalDistance = distanceFromToVia + distanceViaToFinal;
		int totalTime = timeFromToVia + timeViaToFinal;
		System.out.println("The Total Distance travelled by " + name + " from " + fromCity + " to " + toCity + " via " + viaCity + " is " + String.format("%.2f",totalDistance) + " km and " + "the Total Time taken is " + totalTime + " minutes");
	}
}