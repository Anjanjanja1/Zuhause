import java.util.Scanner;

public class Exercise21 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int secret = 26;
        int smaller = secret - 3;
        int smaller2 = secret - 2;
        int smaller3 = secret - 1;
        int bigger = secret + 3;
        int bigger2 = secret + 2;
        int bigger3 = secret + 1;
        System.out.println("Guess the number game :)");
        int userNum;
        do {
            System.out.print("Enter one whole number: ");
            userNum = input.nextInt();
            if (userNum == smaller || userNum == smaller2 || userNum == smaller3) {
                System.out.println("You are close! You have to look a bit higher! Try again..");
            } else if (userNum < secret) {
                System.out.println("Your guess is smaller than the secret number..");
            } else if (userNum == bigger || userNum == bigger2 || userNum == bigger3) {
                System.out.println("Close call! But your number is too high! Try again..");
            } else if (userNum > secret) {
                System.out.println("Your guess is bigger than the secret number..");
            }
        } while (userNum != secret);
        System.out.println("You guessed the secret number! Bravo! :)");
    }
}