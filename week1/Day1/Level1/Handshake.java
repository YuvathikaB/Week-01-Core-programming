import java.util.Scanner;
public class Handshake{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int numberOfStudents= input.nextInt();
		int handshake=(numberOfStudents*(numberOfStudents-1))/2;
		System.out.println("The number of possible handshakes is "+handshake);
	}
}