import java.io.PrintStream;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select an option by entering the number of the option:\n1.Reverse string output\n2.Is number even or odd\n3.Vokals count\n4.Calculate factorial");
        System.out.print("Number: ");
        int choice = scanner.nextInt();
        while (true) {
            if (choice == 1) {
                reverseString();
                break;
            } else if (choice == 2) {
                EvenOdd();
                break;
            } else if (choice == 3) {
                Vowels();
                break;
            } else if (choice == 4) {
                Factorial();
                break;
            } else {
                System.out.print("Choose a valid number: ");
                choice = scanner.nextInt();
            }

        }
        System.out.print("Choose again: ");
        choice = scanner.nextInt();
    }


    public static void reverseString() {
        System.out.println("Enter one word: ");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        String reverseWord = reverseWord(word);
        System.out.printf(reverseWord);
    }

    private static String reverseWord(String word) {
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }
        return reversed;
    }

    static void EvenOdd() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter one whole number: ");
        int num = scanner.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " is an Even number!");
        } else {
            System.out.printf(num + " is an Odd number.");
        }
    }

    static void Vowels() {
        System.out.println("Enter a sentence: ");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        word = word.toLowerCase();
        int countVowels = 0;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                countVowels++;
            }
        }
        System.out.println("This sentence has " + countVowels + " vowels. Happy days!");
    }


    static void Factorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter one whole number: ");
        int num = scanner.nextInt();
        int z = 1;
        int fac = 1;
        while (z <= num) {
            fac *= z;
            z++;
        }
        System.out.println("The factorial of " + num + " is " + fac + ".");
    }
}

