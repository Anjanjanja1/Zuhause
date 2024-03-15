import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //V01();
        //V02();
        //V03();
        //V04();
        //V07();
        //V08();
        //V11();
        //V12();
        //V13();
        //V15();
        //V16();
        //V32();
        //V33();
    }

    public static void V01() {
        System.out.println("Hello\nAnja!");
    }

    public static void V02() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter one number: ");
        int one = scanner.nextInt();
        System.out.println("Enter another number: ");
        int two = scanner.nextInt();
        int sum = one + two;
        System.out.println(sum + " is the sum of these numbers!");
    }

    public static void V03() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter one number: ");
        double one = scanner.nextInt();
        System.out.println("Enter another number: ");
        double two = scanner.nextInt();
        double div = one / two;
        System.out.printf(div + " is the division of these numbers!");
    }

    public static void V04() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter one number: ");
        double one = scanner.nextInt();
        System.out.println("Enter another number: ");
        double two = scanner.nextInt();
        double div = one % two;
        System.out.printf(div + " is the rest from dividing these numbers!");
    }

    public static void V07() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter one number: ");
        double one = scanner.nextInt();
        double sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum = i * one;
            System.out.println(one + " x " + i + " = " + sum);
            sum = sum + sum;
        }
        System.out.println("The sum is: " + sum);
    }

    public static void V08() {
        String one = "J";
        String two = "a";
        String three = "V";
        for (int i = 1; i <= 4; i++) {
            System.out.println("   ");
            for (int j = 1; j <= i; j++) {
                System.out.printf(one);
                System.out.printf("   ");
                System.out.printf(two);
                System.out.printf("   ");
                System.out.printf(three);
                System.out.printf("   ");
                System.out.printf(two);
            }
        }
    }

    public static void V11() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius: ");
        double radius = scanner.nextDouble();
        double per = (2 * 3.14159) * radius;
        double area = 3.14159 * (radius * radius);

        System.out.println("The perimeter is: " + per);
        System.out.println("The area is: " + area);
    }

    public static void V12() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter one number: ");
        double prvi = scanner.nextDouble();
        System.out.printf("Enter another number: ");
        double drugi = scanner.nextDouble();
        System.out.printf("Enter one more number: ");
        double treci = scanner.nextDouble();
        double total = prvi + drugi + treci;
        double aver = total / 3;

        System.out.println("The average of given numbers is: " + aver);
    }

    public static void V13() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter width: ");
        double w = scanner.nextDouble();
        System.out.printf("Enter height: ");
        double h = scanner.nextDouble();
        double area = w * h;
        double per = 2 * (w + h);

        System.out.println("The area is: " + area);
        System.out.println("The perimeter is: " + per);

    }

    public static void V15() { //swaping variables
        int a = 1;
        int b = 2;
        int temp = a;
        a = b;
        b = temp;

        System.out.println(a);
        System.out.println(b);
    }

    public static void V16() { //adding binary numbers
        // Declare variables to store two binary numbers, an index, and a remainder
        long binary1, binary2;
        int i = 0, remainder = 0;

        // Create an array to store the sum of binary digits
        int[] sum = new int[20];

        Scanner in = new Scanner(System.in);
        System.out.print("Input first binary number: ");
        binary1 = in.nextLong();

        System.out.print("Input second binary number: ");
        binary2 = in.nextLong();

        // Perform binary addition while there are digits in the binary numbers
        while (binary1 != 0 || binary2 != 0) {
            // Calculate the sum of binary digits and update the remainder
            sum[i++] = (int) ((binary1 % 10 + binary2 % 10 + remainder) % 2);
            remainder = (int) ((binary1 % 10 + binary2 % 10 + remainder) / 2);
            binary1 = binary1 / 10;
            binary2 = binary2 / 10;
        }

        // If there is a remaining carry, add it to the sum
        if (remainder != 0) {
            sum[i++] = remainder;
        }

        // Decrement the index to prepare for printing
        --i;

        // Display the sum of the two binary numbers
        System.out.print("Sum of two binary numbers: ");
        while (i >= 0) {
            System.out.print(sum[i--]);
        }

        System.out.print("\n");
    }

    static void V32() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input one integer: ");
        int one = scanner.nextInt();
        System.out.print("Input another integer: ");
        int two = scanner.nextInt();

        if (one > two) {
            System.out.println(one + " > " + two);
        }
        if (one != two) {
            System.out.println(one + " != " + two);
        }
        if (one < two) {
            System.out.println(one + " < " + two);
        }
        if (one == two) {
            System.out.println(one + "=" + two);
        }
    }
    static void V33() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number with at least 2 digits: ");
        int [] num = new int[]{input.nextInt()};
        int[] sum = num.clone();
        sum= num;

        System.out.printl   n("The sum of the digits is: " + sum);
    }


}
