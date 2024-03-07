import java.util.Scanner;

public class Exercise21 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int secret = 26;
        System.out.println("Guess the number game :)");
        int userNum;
        do {
            System.out.print("Enter one whole number: ");
            userNum = input.nextInt();
            if (isClose(userNum, secret, 3)) {
            /*if ( )
                System.out.println("You are close! Your guess is only 3 numbers smaller than the secret number..");
            else if () {

            }*/
            }
        } while (userNum != secret);
        System.out.println("You guessed the secret number! Bravo! :)");
    }

    public static boolean isClose(int userNum, int secret, int threshold) {
        return Math.abs(secret - userNum) <= threshold;
    }


}