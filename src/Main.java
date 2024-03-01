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
        double aver = total/3;

        System.out.println("The average of given numbers is: " + aver);
    }

    public static void V13() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter width: ");
        double w = scanner.nextDouble();
        System.out.printf("Enter height: ");
        double h = scanner.nextDouble();
        double area = w * h;
        double per = 2* (w+h);

        System.out.println("The area is: " + area);
        System.out.println("The perimeter is: " + per);

    }

}