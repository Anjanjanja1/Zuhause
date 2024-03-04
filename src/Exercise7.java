/*import java.util.Scanner;

import static java.lang.System.*;

public class Exercise7 {

    public static void main(String[] args) {
        //Tower();
        //Tower2();
    }

    static void Tower() {
        Scanner input = new Scanner(in);
        out.print("Input one whole number to make a tower: ");
        int inp = input.nextInt();

        int z = 2;
        int sum;


        for(int i = 1; i<9; i++){
            sum = inp * z;
            out.println(STR."\{inp} * \{z} = \{sum}");
            inp = sum;
            z++;
        }
        z=2;
        for(int i=1; i<9; i++){

            sum = inp / z;
            out.println(STR."\{inp} / \{z} = \{sum}");
            inp = sum;
            z++;
        }

    }
    static void Tower2() {
        Scanner input = new Scanner(in);
        out.print("Input one whole number to make a tower: ");
        int inp = input.nextInt();

        int z = 2;
        int sum;
        while(z<10) {
            sum = inp * z;
            out.println(STR."\{inp} * \{z} = \{sum}");
            inp = sum;
            z++;
        }
        z=2;
        while(z<10) {
            sum = inp / z;
            out.println(STR."\{inp} / \{z} = \{sum}");
            inp = sum;
            z++;
        }

    }
}
*/
