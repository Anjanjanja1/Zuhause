import java.util.Arrays;

public class Exercise9 {
    public static void main(String[] args) {
        //array1();
        array2();
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
        float[] num = {10.5f, 55.3f, 98.1f, 39.3f, 20.5f};
        float max = num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i] >max) {
                max++;
            }
        }
        System.out.printf("The largest number in the array is: "+max);
    }
}
