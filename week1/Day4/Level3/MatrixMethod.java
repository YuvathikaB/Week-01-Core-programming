package level3;
import java.util.*;
public class MatrixMethod {
    public static int[][] matrix(int r, int c) {
        int[][] matrix = new int[r][c];
        Random rand = new Random();
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                matrix[i][j] = rand.nextInt(10);
        return matrix;
    }
    public static int[][] sumMatrix(int[][] a, int[][] b) {
        int r = a.length, c = a[0].length;
        int[][] res = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                res[i][j] = a[i][j] + b[i][j];
        return res;
    }
    public static int[][] subtractMatrix(int[][] a, int[][] b) {
        int r = a.length, c = a[0].length;
        int[][] res = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                res[i][j] = a[i][j] - b[i][j];
        return res;
    }
    public static int[][] multiplyMatrix(int[][] a, int[][] b) {
        int r = a.length, c = b[0].length, d = a[0].length, e = b.length, sum;
        if (d != e) {
            System.out.println("Multiplication not possible");
        }
        int[][] res = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++) {
                sum = 0;
                for (int k = 0; k < a[0].length; k++)
                    sum += a[i][k] * b[k][j];
                res[i][j] = sum;
            }
        return res;
    }
    public static int[][] transposeMatrix(int[][] a) {
        int r = a.length, c = a[0].length;
        int[][] res = new int[c][r];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                res[j][i] = a[i][j];
        return res;
    }
    public static int determinant2(int[][] matrix) {
        int a = matrix[0][0];
        int b = matrix[0][1];
        int c = matrix[1][0];
        int d = matrix[1][1];
        return (a * d) - (b * c);
    }
    public static int determinant3(int[][] matrix) {
        int a = matrix[0][0], b = matrix[0][1], c = matrix[0][2];
        int d = matrix[1][0], e = matrix[1][1], f = matrix[1][2];
        int g = matrix[2][0], h = matrix[2][1], i = matrix[2][2];
        return a * (e * i - f * h) - b * (d * i - f * g) + c * (d * h - e * g);
    }
    public static double[][] inverse2(int[][] a) {
        int det = determinant2(a);
        if (det == 0) return null;
        double[][] inverse = new double[2][2];
        inverse[0][0] = a[1][1] / (double) det;
        inverse[0][1] = -a[0][1] / (double) det;
        inverse[1][0] = -a[1][0] / (double) det;
        inverse[1][1] = a[0][0] / (double) det;
        return inverse;
    }
    public static double[][] inverse3(int[][] a) {
        int det = determinant3(a);
        if (det == 0) return null;
        double[][] adj = new double[3][3];
        adj[0][0] = a[1][1] * a[2][2] - a[1][2] * a[2][1];
        adj[0][1] = -(a[0][1] * a[2][2] - a[0][2] * a[2][1]);
        adj[0][2] = a[0][1] * a[1][2] - a[0][2] * a[1][1];

        adj[1][0] = -(a[1][0] * a[2][2] - a[1][2] * a[2][0]);
        adj[1][1] = a[0][0] * a[2][2] - a[0][2] * a[2][0];
        adj[1][2] = -(a[0][0] * a[1][2] - a[0][2] * a[1][0]);

        adj[2][0] = a[1][0] * a[2][1] - a[1][1] * a[2][0];
        adj[2][1] = -(a[0][0] * a[2][1] - a[0][1] * a[2][0]);
        adj[2][2] = a[0][0] * a[1][1] - a[0][1] * a[1][0];

        double[][] inverse = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                inverse[i][j] = adj[i][j] / (double) det;
            }
        }
        return inverse;
    }
    public static void displayMatrix(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void displayMatrix(double[][] m) {
        if (m == null) {
            System.out.println("Matrix has no inverse.");
            return;
        }
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(String.format("%.2f", m[i][j]) + "\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] A = matrix(3, 3);
        int[][] B = matrix(3, 3);
        System.out.println("Matrix A:");
        displayMatrix(A);
        System.out.println("\nMatrix B:");
        displayMatrix(B);
        System.out.println("\nAddition:");
        displayMatrix(sumMatrix(A, B));
        System.out.println("\nSubtraction:");
        displayMatrix(subtractMatrix(A, B));
        System.out.println("\nMultiplication:");
        displayMatrix(multiplyMatrix(A, B));
        System.out.println("\nTranspose of A:");
        displayMatrix(transposeMatrix(A));
        System.out.println("\nDeterminant of A: " + determinant3(A));
        System.out.println("\nInverse of A:");
        displayMatrix(inverse3(A));
    }
}
