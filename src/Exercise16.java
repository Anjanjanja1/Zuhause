//Write a program that can convert Celsius to Fahrenheit and vice versa.
// The conversions should be outsourced to methods. The value to be converted and whether it should be
// converted to Fahrenheit or Celsius should be entered by the user.

import java.util.Scanner;

public class Exercise16 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Inp();
    }

    public static void Inp() {
        System.out.print("Enter degrees: ");
        int d = input.nextInt();
        String Dee;
        do {
            System.out.println("F oder C?");
            Dee = input.next().toUpperCase();
            if (Dee.equals("F")) {
                //METODA
            } else if (Dee.equals("C")) {
                //METODA
            } else {
                System.out.println("Did you mistype?");
            }
        } while (!(Dee.equals("F") || Dee.equals("C")));

    }
    public static void Calc(int d, String Dee){

            }
}
