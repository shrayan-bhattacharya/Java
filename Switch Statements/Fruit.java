import java.util.Scanner;

public class Fruit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();

        switch (fruit) {
            case "Mango":
                System.out.println("King of fruits");
                break;
            case "Apple":
                System.out.println("King  red of fruits");
                break;
            case "Orange":
                System.out.println("King  round fruits");
                break;
            case "Grapes":
                System.out.println("King small fruits");
                break;

            default:
                System.out.println("Please enter a valid fruit");

        }
    }
}
