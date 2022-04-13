import java.util.*;

public class Spriral_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        int numbers[][] = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        System.out.println("The Spiral Order Matrix is: ");

        int row_start = 0;
        int row_end = rows - 1;
        int column_start = 0;
        int column_end = columns - 1;

        while (row_start <= row_end && column_start <= column_end) {
            for (int i = column_start; i <= column_end; i++) {
                System.out.print(numbers[row_start][i] + " ");
            }
            row_start++;
            for (int i = row_start; i <= row_end; i++) {
                System.out.print(numbers[i][column_end] + " ");
            }
            column_end--;
            for (int i = column_end; i >= column_start; i--) {
                System.out.print(numbers[row_end][i] + " ");
            }
            row_end--;
            for (int i = row_end; i >= row_start; i--) {
                System.out.print(numbers[i][column_start] + " ");
            }
            column_start++;

            System.out.println();
        }
    }
}
