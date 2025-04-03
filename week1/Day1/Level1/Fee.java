public class Fee{
	public static void main(String[] args){
		int fee=125000;
		int discountPercent=10;
		int discount=((discountPercent*fee)/100);
		int finalFee=fee-discount;
		System.out.println("The discount amount is INR "+ discount + " and final discounted fee is INR "+ finalFee);
	}
}