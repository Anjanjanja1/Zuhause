import java.util.Scanner;

public class Exercise19 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Input one number: ");
        int userNum = input.nextInt();
        calc(userNum);
    }

    public static void calc(int userNum) {
        int jedan = 1;
        int sto = 100;
        while (jedan <= sto) {
            if (jedan % userNum == 0)
                System.out.print(jedan + " ");
            jedan++;
        }

    }
}


