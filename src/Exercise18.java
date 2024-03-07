import java.util.Scanner;

public class Exercise18 {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter one positive number: ");
        int num = input.nextInt();
        calc(num);

    }
    public static void calc(int num) {
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            sum = num + i;
        }
        System.out.println("Output: " + sum);

    }
}
