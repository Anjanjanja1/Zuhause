import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        //info();
    }

    public static void info() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter your name: ");
        String name = scanner.next();
        System.out.printf("Enter your age: ");
        int age = scanner.nextInt();
        System.out.printf("Hello, " + name + "! You are " + age + " years old!");
    }
}
