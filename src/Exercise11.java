//pogledaj dal mores ukljuciti invalid message ako se ne upise broj!
//Write a program that checks whether an entered number is even or odd. Write a method for this

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        //int num = 0;
        //met(num);
    }

    public static void met(int num) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input one number: ");
        num = input.nextInt();
        if (num % 2 == 0) {
            System.out.println("Number " + num + " is even.");
        } else {
            System.out.println("Number " + num + " is odd.");
        }
    }
}
