import java.util.Scanner;
public class MultiArr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row = input.nextInt();
        System.out.print("Enter the number of columns: ");
        int col = input.nextInt();
        int[][] matrix = new int[row][col];
        System.out.println("Enter the elements of the 2D array:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                matrix[i][j] = input.nextInt();
            }
        }
        int[] array = new int[row * col];
        int index = 0;  
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                array[index++] = matrix[i][j];
            }
        }
        System.out.println("2D Array - Matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); 
        }
        System.out.print("1D Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}