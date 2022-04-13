import java.util.*;

public class Circle {
    public static double circum(double r) {
        return (2 * 3.14 * r);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of the circle : ");
        double r = sc.nextDouble();

        System.out.println("The Circumference of the circle is= " + circum(r));
    }
}
