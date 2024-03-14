import java.util.Scanner;

public class Exercise24 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //Change your calculator program from the first part (Exercise 1.10)
        // so that it runs until the user terminates it. The user can exit a program
        // by typing the letter q. Likewise, an invalid input for the operation should
        // not abort the program, but rather prompt the user for input until it is OK.
        String operation = null;
        double operand1 = 0;
        double operand2 = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("First operand: ");
            if (input.hasNextDouble()) { //checks if the input is a double
                operand1 = input.nextDouble();
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                input.next(); //Clear the invalid input
            }
        }
        validInput = false;
        while (!validInput) {
            System.out.print("Operation: +, -, *, /");
            if (input.hasNext()) { //checks if the input is valid
                operation = input.next();
                validInput = true;
            } else {
                System.out.println("Invalid input.");
                input.next(); //Clear the invalid input
            }
        }
        validInput = false;
        while (!validInput) {
            System.out.print("First operand: ");
            if (input.hasNextDouble()) { //checks if the input is a double
                operand2 = input.nextDouble();
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                input.next(); //Clear the invalid input
            }
        }
        double sum = 0;
        switch (operation) {
            case "+":
                sum = operand1 + operand2;
                break;
            case "-":
                sum = operand1 - operand2;
                break;
            case "*":
                sum = operand1 * operand2;
                break;
            case "/":
                sum = operand1 / operand2;
                break;
        }
    }
}

