//Write a program that can convert Celsius to Fahrenheit and vice versa.
// The conversions should be outsourced to methods. The value to be converted and whether it should be
// converted to Fahrenheit or Celsius should be entered by the user.
//"%.2f" is for shorter decimal number!

import java.util.Scanner;

public class Exercise16 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Inp();
    }

    public static void Inp() {
        System.out.print("Enter degrees: ");
        double d = input.nextDouble();
        String Dee;
        do {
            System.out.println("F oder C?");
            Dee = input.next().toUpperCase();
            if (Dee.equals("F")) {
                FtoC(d);
                return;
            } else if (Dee.equals("C")) {
                CtoF(d);
                return;
            } else {
                System.out.println("Did you mistype?");
            }
        } while (!(Dee.equals("F") || Dee.equals("C")));

    }

    public static void FtoC(double d) {
        double cel= ((d - 32) / 1.8);
        System.out.println(d+" Fahrenheit is "+cel+" Celsius.");
        Inp();
    }

    public static void CtoF(double d) {
        double fah= ((d * 1.8) + 32);
        System.out.println(d+" Celsius is "+fah+" Fahrenheit.");
        Inp();
    }

}
