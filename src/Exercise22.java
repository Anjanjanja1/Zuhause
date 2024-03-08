import java.util.Scanner;

public class Exercise22 {
    private static final Scanner input= new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("First operand: ");
        double operand1 = input.nextDouble();
        System.out.println("Operation: +, -, *, /");
        String operation = input.next();
        System.out.println("Second operand: ");
        double operand2 = input.nextDouble();
        double sum= 0;
        switch (operation){
            case "+":
                sum = operand1+operand2;
                break;
            case "-":
                sum= operand1-operand2;
                break;
            case "*":
                sum= operand1*operand2;
                break;
            case "/":
                sum = operand1/operand2;
                break;
            default:
                System.out.println("Error");
        }
        System.out.println("Calculation: \n"+sum);
    }

}
