import java.util.*;

public class login {
    static String username = "pragati";
    static String password = "pragati@123";
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("|      Login Page Application    |");
        System.out.println("=================================");
        System.out.println("Enter a username : ");
        String user = sc.next();
        if (userAuthenticate(user)) {
            System.out.println("User Verified!");
            System.out.println("Enter a password : ");
            String pass = sc.next();
            if (passAuthenticate(pass)) {
                System.out.println(" Login Successfully");

                homepage();

            } else {
                System.out.println("Incorrect Password!");

                forgot();
            }

        } else {
            System.out.println("Incorrect Username!");
        }

    }

    public static boolean userAuthenticate(String user) {
        if (username.equals(user)) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean passAuthenticate(String pass) {
        if (password.equals(pass)) {
            return true;
        } else {
            return false;
        }

    }

    public static void forgot() {
        System.out.println("Enter your Mobile Number");
        System.out.println("Generating OTP....");
        long otp = Math.round(Math.random() * 10000);
        System.out.println("OTP : " + otp);
        System.out.println("Enter a OTP : ");
        long userotp = sc.nextLong();
        if (otp == userotp) {
            homepage();
        } else {
            System.out.println("Incorrect OTP!");
        }

    }

    public static void homepage() {
        System.out.println("Welcome to Home Page!");

    }

}
