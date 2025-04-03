import java.util.Scanner;
public class FeeUser{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your fee: ");
		int fee= input.nextInt();
		System.out.print("Enter your discount percent: ");
		int discountPercent= input.nextInt();
		int discount=((discountPercent*fee)/100);
		int finalFee=fee-discount;
		System.out.println("The discount amount is INR "+ discount + " and final discounted fee is INR "+ finalFee);
	}
}