import java.util.*;

public class Vote {
    public static String vote(int a) {
        if (a >= 18)
            return "YES, you are eligible to vote";

        else
            return "NO, you are not eligible to vote";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter YOUR AGE : ");
        int a = sc.nextInt();

        System.out.println(vote(a));
    }
}
