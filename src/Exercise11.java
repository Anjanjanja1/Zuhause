import java.util.Scanner;

public class Exercise11 {
    public static void main(){
        Scanner input = new Scanner(System.in);
        System.out.printf("Input one number: ");
        int num = input.nextInt();
        metode(num);
    }
    public static void metode(int num){
        if (num%2==0){
            System.out.println(num+" is even.");
        } else if(!(num%2==0)){
            System.out.println(num+" is odd.");
        } else {
            System.out.println("Invalid input.");
        }

    }
}
