import java.util.Scanner;
public class YoungestArr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		int[] age=new int[3];
		double[] height=new double[3];
		String[] name={"Amar","Akbar","Anthony"};
		for (int i=0;i<3;i++){
			System.out.print("Enter age of "+name[i]+":");
			age[i]=input.nextInt();
			System.out.print("Enter height of "+name[i]+":");
			height[i]=input.nextDouble();
			System.out.println();
		}
		int min=age[0];
		String young=name[0];
		for (int i=1;i<3;i++){
			if(age[i]<min){
				min=age[i];
				young=name[i];
			}
		}
		double max=height[0];
		String tall=name[0];
		for (int i=1;i<3;i++){
			if(height[i]>max){
				max=height[i];
				tall=name[i];
			}
		}
		System.out.println();
		System.out.println("The youngest friend is : "+young);
		System.out.println("The tallest friend is : "+tall);
	}
}
			
			
		
		