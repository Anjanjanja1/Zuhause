public class Exercise5 {
    public static void main(String[] args) {
        Fibonacci();
    }

    static void Fibonacci() {
        int count = 20;
        int a = 0;
        int b = 1;
        for (int i = 0; i < count; i++) {
            int sum = a + b;
            System.out.print(sum + " ");
            a = b;
            b = sum;
        }
    }
}
