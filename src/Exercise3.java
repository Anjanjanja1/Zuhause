import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        //bankomat();
    }

    static void bankomat() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your account balance: ");
        double balance = scanner.nextDouble();
        System.out.println("Menu: \n1.Deposit\n2.Withdraw\n3.Check Balance\n4.Exit");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        while (choice != 4) {
            switch (choice) {
                case 1:
                    System.out.println("Enter the amount you would like to deposit: ");
                    double amount = scanner.nextDouble();
                    balance = balance + amount;
                    System.out.println("Your new account balance is: " + balance + " Euro");
                    break;
                case 2:
                    System.out.println("Enter the amount you would like to withdraw: ");
                    amount = scanner.nextDouble();
                    balance = balance - amount;
                    System.out.println("Your new account balance is: " + balance + " Euro");
                    break;
                case 3:
                    System.out.println("Your current account balance is: " + balance + " Euro");
                    break;
                case 4:
                    break;
            }
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
        }
    }
}

