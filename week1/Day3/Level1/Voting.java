import java.util.Scanner;
class Voting{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int[] arr = new int[10];
		for(int i=0;i<10;i++){
		System.out.print("Enter the age of student "+ (i+1) + ": ");
			arr[i]=input.nextInt();
		}
		for(int i=0;i<10;i++){
			if (arr[i]<0){
				System.out.println("Invalid age");
			} else if (arr[i]>=18){
				System.out.println("The student with the age "+arr[i]+" can vote");
			} else{
				System.out.println("The student with the age "+arr[i]+" cannot vote");
			}
		}
	}
}
				
				
				
		
