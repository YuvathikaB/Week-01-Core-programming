import java.util.Scanner;
public class Price{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter unit price: ");
		int unitPrice= input.nextInt();
		System.out.print("Enter quantity: ");
		int quantity= input.nextInt();
		int price=unitPrice*quantity;
		System.out.println("The total purchase price is INR " +price + "  - if the quantity is " +quantity + " and unit price is INR " +unitPrice);
	}
}