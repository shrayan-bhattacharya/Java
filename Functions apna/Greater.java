import java.util.*;
import java.util.function.Function;

public class Greater {

    public static int greater(int a, int b) {
        if (a > b)
            return a;

        else
            return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("The Greater number is= " + greater(a, b));
    }
}
