public class Profit{
	public static void main(String[] args){
		int cp=129;
		int sp=191;
		int profit=sp-cp;
		double percentage=((double)profit/cp)*100;
		System.out.println(" The Cost Price is INR " + cp + " and Selling Price is INR "+sp);
		System.out.println(" The Profit is INR " + profit + " and the Profit Percentage is INR "+ String.format("%.2f",percentage));
		
	}
}