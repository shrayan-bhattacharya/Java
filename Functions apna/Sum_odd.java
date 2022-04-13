import java.util.*;

public class Sum_odd {
    public static int sum_odd(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        System.out.println("Sum of all odd numbers from 1 to " + n + " is= " + sum_odd(n));
    }
}
