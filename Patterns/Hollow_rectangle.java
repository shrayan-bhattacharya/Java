import java.util.*;

public class Hollow_rectangle {
    public static void main(String[] args) {
        int row = 4, column = 5;

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= column; j++) {
                if (i == 1 || j == 1 || i == row || j == column) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
