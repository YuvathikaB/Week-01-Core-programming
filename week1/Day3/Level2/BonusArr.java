import java.util.Scanner;
public class BonusArr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		double[] salary=new double[10];
		double[] service=new double[10];
		double[] newSal=new double[10];
		double[] bonus=new double[10];
		double bonusTot=0;
		double salTot=0;
		double newSalTot=0;
		for (int i=0;i<10;i++){
			System.out.println("Enter details of employee "+(i+1));
			while(true){
				System.out.print("Enter salary: ");
				salary[i]=input.nextDouble();
				if(salary[i]>0){
					break;
				}else{
					System.out.println("Enter valid salary");
				}
			}
			while(true){
				System.out.print("Enter years of service: ");
				service[i]=input.nextDouble();
				if(service[i]>0){
					break;
				}else{
					System.out.println("Enter valid number");
				}
			}
			if (service[i]>5){
				bonus[i]=salary[i]*0.05;
			}else{
				bonus[i]=salary[i]*0.02;
			}
			newSal[i]=bonus[i]+salary[i];
			bonusTot+=bonus[i];
			salTot+=salary[i];
			newSalTot+=newSal[i];
		}
		System.out.println();
		System.out.println("Total bonus payout : "+bonusTot);
		System.out.println("Total old salary: "+salTot);
		System.out.println("Total new salary: "+newSalTot);
	}
		
}

					
			
			
		