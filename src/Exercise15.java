


//Test your methods in main .

public class Exercise15 {
    public static void main(String[] args) {
        Add(3,39);
        Min(3,39);
        Max(3,39);
        Abs(3);
    }

    public static void Add(int a, int b) {
        //Add: The method should take 2 integers, add them together and return the result as an integer
        System.out.println(a+b);
    }
    public static void Min(int a, int b){
        //Min/Max: 2 methods that take 2 integers as arguments and return the smaller/larger of the two numbers
        System.out.println(Math.min(a, b));
    }
    public static void Max(int a, int b) {
        System.out.println(Math.max(a, b));
    }

    public static void Abs(int a) {
        //Section: This method takes 1 integer and returns its absolute value
        System.out.println(Math.abs(a));
    }
}
