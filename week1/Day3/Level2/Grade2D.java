import java.util.Scanner;
public class Grade2D{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter no.of students:");
		int num = input.nextInt();
		double[][] student = new double[num][4];
		String[] grades = new String[num];
		for (int i=0;i<num;i++){
			System.out.println("Enter marks of student "+(i+1)+" : ");
			System.out.print("Physics:");
			double physics = input.nextDouble();
			if(physics<0){
				System.out.println("Invalid number! Enter a positive number for physics: ");
				physics = input.nextDouble();
			}
			System.out.print("Chemistry:");
			double chemistry = input.nextDouble();
			if(chemistry<0){
				System.out.println("Invalid number! Enter a positive number for chemistry: ");
				chemistry = input.nextDouble();
			}
			System.out.print("Maths:");
			double maths = input.nextDouble();
			if(maths<0){
				System.out.println("Invalid number! Enter a positive number for maths: ");
				maths = input.nextDouble();
			}
			System.out.println();
			student[i][0] = physics;
			student[i][1] = chemistry;
			student[i][2] = maths;
			double percentage = (physics + chemistry + maths)/3;
			student[i][3] = percentage;
			if(percentage >= 80){
				grades[i] = "A";
			}
			else if(percentage >=70 && percentage<=79){
				grades[i] = "B";
			}
			else if(percentage >=60 && percentage<=69){
				grades[i] = "C";
			}
			else if(percentage >=50 && percentage<=59){
				grades[i] = "D";
			}
			else if(percentage >=40 && percentage<=49){
				grades[i] = "E";
			}
			else{
				grades[i]="R";
			}
		}
		System.out.println();
		for(int i=0;i<num;i++){
			System.out.println("Student "+(i+1)+" : "+ " Physics : "+student[i][0]+" , Chemistry : "+student[i][1]+" , Maths : "+student[i][2]+" , percentage : "+String.format("%.2f",student[i][3])+" , Grade : "+grades[i]);
		}
	}
}