import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Exercise8 {
    public static void main(String[] args) {
        //UserLogin();
    }

    static void UserLogin() {
        int attempts = 0;
        String username;
        String password;
        do {
            Scanner input = new Scanner(in);
            out.println("Please enter your username: ");
            username = input.next();
            out.println("Please enter your password: ");
            password = input.next();
            attempts++;
            if (attempts == 3) {
                out.println("Maximum number of attempts reached. Exit programme.");
                break;
            }
            if (!username.equals("user123") || !password.equals("password123")) {
                out.println("Incorrect username or password. Please try again.");
            }

        } while (!username.equals("user123") || !password.equals("password123"));

        if (username.equals("user123") || password.equals("password123")) {
            out.println("You are logged in as user 123!");
        }
    }
}