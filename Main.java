import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input matrix dimensions
        int n = sc.nextInt();  
        int[][] matrix = new int[n][n];

        // Input matrix elements
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        sc.close();

        // Rotate the matrix
        rotateMatrix(matrix, 0, n);

        // Print the rotated matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void rotateMatrix(int[][] matrix, int start, int size) {
        if (size <= 1) return; // Base case: Single layer or empty matrix

        int end = start + size - 1;

        // Rotate the outer layer
        for (int i = 0; i < size - 1; i++) {
            int temp = matrix[start][start + i]; // Top
            matrix[start][start + i] = matrix[end - i][start]; // Left -> Top
            matrix[end - i][start] = matrix[end][end - i]; // Bottom -> Left
            matrix[end][end - i] = matrix[start + i][end]; // Right -> Bottom
            matrix[start + i][end] = temp; // Top -> Right
        }

        // Recursively rotate the inner submatrix
        rotateMatrix(matrix, start + 1, size - 2);
    }
}


int n = sc.nectInt();
int[] [] matrix= new int[n][n];

for (int i = 0; i <n; i ++){
    for (int j = 0; j < n; j ++){
        matrix[i][j] = sc.nextInt();
    }
}

sc.close();

rotateMatrix(matrix, 0, n);

for (int i = 0; i < n; i ++){
    for (int j = 0; j < n; j ++){
        System.out.print(matrix[i][j] + " ");
    }
    System.out.println();

    
public static void rotateMatrix(int[][] matrix, int start, int size){
}