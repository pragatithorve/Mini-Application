
import java.util.Scanner;

public class credit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("|         CREDIT CARD APP         |");
        System.out.println("====================================");

        System.out.print("\nEnter Card Number : ");
        String card = sc.nextLine();

        if (card.length() != 16) {

            System.out.println("\n Invalid Card Number!");

        } else {

            String last4 = card.substring(card.length() - 4);

            String star = "*".repeat(card.length() - 4);

            System.out.println("\nCard Verified!");
            System.out.println(" Secure Card : " + star + last4);
        }

        System.out.println("\n================================");
        System.out.println("         Your Data is Safe");
        System.out.println(" =================================");
    }
}
