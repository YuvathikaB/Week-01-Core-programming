public class Volume{
	public static void main(String[] args){
		int r=6378;
		double pi=3.14;
		double volume=(4.0/3.0)*pi*Math.pow(r,3);
		double miles=volume*0.239335; //1km^3=0.239335miles^3
		System.out.println("The volume of earth in cubic kilometers is "+ String.format("%.2f",volume) +" and cubic miles is "+String.format("%.2f",miles));
	}
}