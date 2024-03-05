import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        ageMet();
    }
//ageMet is getting age input and determines which categories can user apply for
    public static void ageMet() {
        Scanner input = new Scanner(System.in);
        System.out.print("How old are you? ");
        int age = input.nextInt();

        if (age >= 100) {
            System.out.println("You are too old!");
        } else if (age >= 24) {
            printCategories("AM (Mopeds)", "A1 (Light motorcycles)", "B1 (Quadricycles)", "A2 (Standard motorcycles)", "B/BE (Cars)", "C1/C1E (Medium-sized vehicles)", "A (Heavy motorcycles)", "C/CE (Large vehicles)", "D1/D1E (Minibuses)", "D/DE (Buses)");
        } else if (age >= 21) {
            printCategories("AM (Mopeds)", "A1 (Light motorcycles)", "B1 (Quadricycles)", "A2 (Standard motorcycles)", "B/BE (Cars)", "C1/C1E (Medium-sized vehicles)", "A (Heavy motorcycles)", "C/CE (Large vehicles)", "D1/D1E (Minibuses)");
        } else if (age >= 20) {
            printCategories("AM (Mopeds)", "A1 (Light motorcycles)", "B1 (Quadricycles)", "A2 (Standard motorcycles)", "B/BE (Cars)", "C1/C1E (Medium-sized vehicles)", "A (Heavy motorcycles)");
        } else if (age >= 18) {
            printCategories("AM (Mopeds)", "A1 (Light motorcycles)", "B1 (Quadricycles)", "A2 (Standard motorcycles)", "B/BE (Cars)", "C1/C1E (Medium-sized vehicles)");
        } else if (age >= 16) {
            printCategories("AM (Mopeds)", "A1 (Light motorcycles)", "B1 (Quadricycles)");
        } else {
            System.out.println("You are too young!");
        }
    }

    // Method to print categories of driving license
    public static void printCategories(String... categories) {
        System.out.println("You can apply for driving licence categories:");
        // Iterate over each category provided as arguments to the method
        for (String category : categories) {
            // Print each category
            System.out.println(category);
        }
    }
}