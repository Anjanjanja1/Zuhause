import java.util.Scanner;

import static java.lang.System.*;

public class Exercise6 {
    public static void main (String[] args) {
        //oddNum();
    }
    static void oddNum() {
        Scanner input = new Scanner(in);
        out.print("Input one whole number: ");
        int inpZ= input.nextInt();

        for(int i = 1; inpZ >= i; i+=2){
            out.print(i);
            out.print(" ");
        }

    }
}
