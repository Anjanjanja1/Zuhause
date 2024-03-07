import java.util.Arrays;

public class DArrays {
    public static void main(String[] args) {
        //int[][] array = new int[3][3];
        int[][] array2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int length = 9;
        int [] array = new int[length];
        int counter = 0;
        int sum = 0;
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                array[counter] = array2[i][j];
                counter++;
                if (i == j) {
                    System.out.println(array2[i][j]);
                    sum += array2[i][j]; //SUMA OD DIJAGONALEEEEEE
                }
                //sum += array2[i][j]; KAD JE TU ONDA JE SUMA SVEGA U ARRAYS!!!!!
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(sum);


        /*for (int i = 0; i < array.length; i++) { //first [3]
            for (int j = 0; j < array[i].length; j++) { //second [3]
                array[i][j] = i + j;
            }
        }

        for (int i = 0; i < array.length; i++) {  //this for is displaying int [3][3]
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();


        for (int i = 0; i < array2.length; i++) { //and this one the second array with actual numbers :)
            System.out.println("Array on index " + i + ":");
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();*/
    }
}