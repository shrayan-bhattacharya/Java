import java.util.*;

public class Power {
    public static double power(double a, double b) {
        return (Math.pow(a, b));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("The Answer is= " + power(a, b));
    }
}
