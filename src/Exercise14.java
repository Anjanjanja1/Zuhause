import java.util.Scanner;

public class Exercise14 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String... args) {
        Inp();

    }

    public static void Inp() {
        System.out.println("What is your age?");
        int age = input.nextInt();
        if (age < 18) {
            System.out.println("You will need to use a different program to calculate your BMI. Sorry!");
            return; // Exit the method if age is less than 18
        }
        double w, h;
        System.out.println("Please enter your weight in kg: ");
        w = input.nextDouble();
        System.out.println("Please enter your height in cm: ");
        h = input.nextDouble();
        calculation(w, h);
    }

    public static void calculation(double w, double h) {
        double s = (h/100) * (h/100);
        double BMI = w / s;
        if (BMI > 30) {
            System.out.println("You are obese");
        } else if (BMI >= 25 && BMI <= 29.9) {
            System.out.println("Your are overweight");
        } else if (BMI >= 18.5 && BMI <= 24.9) {
            System.out.println("Your are a healthy weight");
        } else if (BMI < 18.5) {
            System.out.println("Your are underweight");
        } else {
            System.out.println("Search for a doctor!");
        }
    }

}
