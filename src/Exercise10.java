import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        //test1();
        //test2();
        //test3();
        //test4();
        //test5();
        //test6();
        //test7();
        //loopic(2025, 2125);
    }

    static void test1() {
        String b = "absodjg";

        System.out.println(b.charAt(1)); //pokaze ti trazeni-zadani karakter u rijeci
        System.out.println(b.substring(1, b.length())); //od do ti ispise..

        Scanner input = new Scanner(System.in);
        b = input.next();
        System.out.println(b); //ovo ponovi kaj si inputala
    }

    static void test2() {
        int one = 2;
        int two = 1;
        System.out.println("One side of a rectangle is " + one + " cm long, and the other " + two + " cm.");
        System.out.println("The parimeter is " + 2 * (one + two) + ", and the area is " + one * two + ".");
    }

    static void test3() {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a number: ");
        Double unum = input.nextDouble();
        System.out.printf("km or miles: ");
        String user = input.next();
        if (user.equals("km")) {
            double m = unum * 0.621371;
            System.out.println(unum + " kilometers is " + m + " miles.");
        } else if (user.equals("miles")) {
            double km = unum * 1.60934;
            System.out.println(unum + " miles is " + km + " kilometers.");
        } else {
            System.out.println("The input is not correct!");
        }
        /*possible solution with 2 methods:
        Scanner input = new Scanner(System.in);

        public static double kmToMiles(double km){ return km * 0.621371} is also a good option
        public static double milesToKm(double miles){ return miles * 1.60934}*/
    }

    static void test4() { //rijeseno pomocu metode average()
        Scanner input = new Scanner(System.in);
        System.out.print("Enter one number: ");
        int num1 = input.nextInt();
        System.out.print("Enter another number: ");
        int num2 = input.nextInt();
        System.out.println("The average of " + num1 + " and " + num2 + " is " + average(num1, num2) + ".");
    }

    public static double average(int num1, int num2) {
        return (num1 + num2) / 2.0; //tu moras paziti da ne zaribas datentypes..mora biti podjeljeno sa 2.0!
        // plus ne moras napraviti novu varijablu za tu racunicu, mores samo return racunicu

    }

    static void test5() {
        Scanner input = new Scanner(System.in);

        int p, r, s;
        System.out.println("Enter three numbers: ");
        p = input.nextInt();
        r = input.nextInt();
        s = input.nextInt();
        System.out.println(max(p, r, s) + " is the biggest number.");
    }

    public static int max(int d, int e, int f) {
        //ILI SAMO OVO: return Math.max(Math.max(d , e),f);

        //int temp = x>y? x:y;
        //int max = temp > z? temp:z;
        //
        int max = 0;
        max = d;
        if (e > max) {
            max = e;
        }
        if (f > max) {
            max = f;
        }
        return max;
    }

    static void test6() {
        for (int i = 1; i <= 100; i++) { //mozes to i sa metodama: 1 metoda za for loop i jedna za if else[SLIKE!]
            if (i % 3 == 0) {
                System.out.print(" Fizz ");
            } else if (i % 5 == 0) {
                System.out.print(" Buzz ");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(" FizzBuzz ");
            } else {
                System.out.printf(String.valueOf(" " + i + " "));
            }
        }
    }

    //test7()
    public static void loopic(int s, int t) {
        for (int i = s; i <= t; i++) {
            met(i);
        }
    }

    public static void met(int i) {
        if (i % 4 == 0) {
            System.out.print(i + " ");
        } else {
            System.out.print(" ");
        }
    }

}
