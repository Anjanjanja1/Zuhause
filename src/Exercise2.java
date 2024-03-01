import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        numberToword();
    }

    static void numberToword() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter one number between 1 and 10: ");
        int number = scanner.nextInt();
        while (number < 1 || number > 10) {
            System.out.printf("Invalid number! Enter number between 1 and 10: ");
            number = scanner.nextInt();
        }
        if (number >= 1 && number <= 10) {
            switch (number) {
                case 1:
                    System.out.printf("one");
                    break;
                case 2:
                    System.out.printf("two");
                    break;
                case 3:
                    System.out.printf("three");
                    break;
                case 4:
                    System.out.printf("four");
                    break;
                case 5:
                    System.out.printf("five");
                    break;
                case 6:
                    System.out.printf("six");
                    break;
                case 7:
                    System.out.printf("seven");
                    break;
                case 8:
                    System.out.printf("eight");
                    break;
                case 9:
                    System.out.printf("nine");
                    break;
                case 10:
                    System.out.printf("ten");
                    break;
            }
        }
    }
}






