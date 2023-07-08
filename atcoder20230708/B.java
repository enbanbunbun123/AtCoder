package atcoder20230708;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // get the number of rows
        int N = scanner.nextInt();
        scanner.nextLine();

        // get the matrix
        char[][] matrix = new char[N][N];
        for (int i = 0; i < N; i++) {
            matrix[i] = scanner.nextLine().toCharArray();
        }

        // rotate the border
        char[][] newMatrix = rotateBorder(matrix, N);

        // print the rotated matrix
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(newMatrix[i][j]);
            }
            System.out.println();
        }
    }

    static char[][] rotateBorder(char[][] matrix, int N) {
        // save the corner elements
        char topRight = matrix[0][N - 1];
        char topLeft = matrix[0][0];
        char bottomRight = matrix[N - 1][N - 1];
        char bottomLeft = matrix[N - 1][0];

        // shift the top row to the right
        for (int j = N - 1; j > 0; j--) {
            matrix[0][j] = matrix[0][j - 1];
        }
        matrix[0][1] = topLeft;

        // shift the right column down
        for (int i = N - 1; i > 0; i--) {
            matrix[i][N - 1] = matrix[i - 1][N - 1];
        }
        matrix[1][N - 1] = topRight;

        // shift the bottom row to the left
        for (int j = 0; j < N - 1; j++) {
            matrix[N - 1][j] = matrix[N - 1][j + 1];
        }
        matrix[N - 1][N - 2] = bottomRight;

        // shift the left column up
        for (int i = 0; i < N - 1; i++) {
            matrix[i][0] = matrix[i + 1][0];
        }
        matrix[N - 2][0] = bottomLeft;

        return matrix;
    }
}

