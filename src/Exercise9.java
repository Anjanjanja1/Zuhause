import java.util.Arrays;
import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        //array1();
        //array2();
        //array3();
        //array4();
        //array5();
        //array6();
        //array7();
        //array8();
        //array9();
        //array10();
    }

    static void array1() {
        int[] row = new int[10];
        int z = 1;
        for (int i = 0; i < row.length; i++) {
            row[i] = z;
            System.out.println(row[i]);
            z++;

        }

    }

    static void array2() {
        float[] num = {10.5f, 55.3f, 11.1f, 39.3f, 20.5f};
        float max = num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }
        System.out.printf("The largest number in the array is: " + max);
    }

    static void array3() {
        String[] strings = {"dobar", "dan", "vam", "zelim", "danas", "je", "ponedjeljak", "pozdrav"};
        for (int i = 0; i < strings.length; i++) {
            int sta = strings[i].length();
            System.out.println("The word has " + sta + " letters.");
        }

    }

    static void array4() {
        int[] num = {5, 7, 3, 9, 30, 10, 223, 45, 34, 212, 18, 90}; //686
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i];
        }
        System.out.println("The sum of numbers is: " + sum);
    }

    static void array5() { //dal je ovo dobro?
        int[] num = {5, 7, 3, 9, 30, 10, 223, 45, 34, 212, 18, 90, 67, 96, 1};
        for (int i = 0; i < num.length; i++) {
            System.out.println("Number: " + num[i]);
        }
    }

    static void array6() {
        int[] num = {5, 7, 3, 9, 30, 10, 223, 45, 34, 212, 18, 90, 67, 96, 1, 20, 41, 0, 65, 28};
        int i;
        System.out.println("The even numbers on the list are: ");
        for (i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0 && num[i] != 0) {
                System.out.print(num[i] + " ");
            }
        }

    }

    static void array7() {
        String[] sve = {"ana", "voli", "milovana", "bog", "mi", "pomori", "ovo", "skuziti", "sunce", "disi"};
        System.out.println("The words that start with letter a: ");
        for (int i = 0; i < sve.length; i++) {
            if (sve[i].startsWith("a")) {
                System.out.println(sve[i] + " ");
            }
        }
    }

    static void array8() {
        Scanner input = new Scanner(System.in);
        int[] userNum = new int[10];
        System.out.println("Input 10 whole numbers: ");
        int i;
        int sum = 0;
        for (i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            userNum[i] = input.nextInt();
            sum += userNum[i];
        }
        System.out.println("The sum of given numbers is: " + sum);
    }

    static void array9() {
        int[] num = {5, 2, 3, 9, 5, 1};
        int min = num[0]; //5
        for (int i = 0; i < num.length; i++) {
            if (num[i] < min) {
                min = num[i];
            }
        }
        System.out.printf(min + " is the smallest number of this array.");
    }

    static void array10() {
        float[] num = {10.5f, 55.3f, 11.1f, 39.3f, 20.5f, 7.3f, 9.1f, 85.4f, 14.9f};
        float sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        float avg = sum / num.length;
        System.out.println("The average of this array is: " + avg);
    }
}

