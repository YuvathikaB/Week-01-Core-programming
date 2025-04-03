import java.util.Scanner;
public class OddEvenArr{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
		int number = input.nextInt();
		if (number <= 0) {
			System.err.println("Error");
				return;
		}else{
			int size=number/2+1;
			int odd[]=new int[size];
			int even[]=new int[size];
			int oddidx=0;
			int evenidx=0;
			for (int i=1;i<number;i++){
				if (i % 2 == 0) {
					even[evenidx++]=i;
				}else{
					odd[oddidx++]=i;
				}
			}
			System.out.print("Even numbers: ");
			for (int i=0;i<evenidx;i++){
				System.out.print(even[i]+" ");
			}
			System.out.println();
			System.out.print("Odd numbers: ");
			for (int i=0;i<oddidx;i++){
				System.out.print(odd[i]+" ");
			}
			System.out.println();
		}
	}
}
			
					
			
				
			
            
					