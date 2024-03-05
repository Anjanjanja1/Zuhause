import java.util.Random;
import java.util.Scanner;

public class Exercise13 {
    //to create a single Scanner object for reading input
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        temperature();

    }

    public static void temperature() {
        System.out.println("How many degrees is outside?");
        int temp = input.nextInt();

        if (temp >= -20 && temp <= -10) {
            temp = 1;
            weather(temp);
        } else if (temp >= -9 && temp <= 1) {
            temp = 2;
            weather(temp);
        } else if (temp >= 2 && temp <= 12) {
            temp = 3;
            weather(temp);
        } else if (temp >= 13 && temp <= 23) {
            temp = 4;
            weather(temp);
        } else if (temp >= 24 && temp <= 35) {
            temp = 5;
            weather(temp);
        } else {
            System.out.println("Did you mistype?");
            temperature();
        }
    }

    public static void weather(int temp) {
        
        System.out.println("And what is the weather like today? Sunny, cloudy or raining");
        String vreme = input.next().toLowerCase();
        switch (vreme) {
            case "sunny":
                Sunny(temp);
                break;
            case "cloudy":
                Cloudy(temp);
                break;
            case "raining":
                Rainy(temp);
                break;
            default:
                System.out.println("Did you mistype?");
                weather(temp);
        }


    }

    public static void Sunny(int temp) {

        if (temp == 1) {
            System.out.println("It would be the best to stay at home when it is this cold! Game night sounds fun!");
        } else if (temp == 2) {
            System.out.println("You could go for a short walk. Maybe the sun would warm you a bit even if the temperature is low.");
        } else if (temp == 3) {
            System.out.println("A walk in a park sounds good :)");
        } else if (temp == 4) {
            System.out.println("Definitely go hiking, enjoy the nature!");
        } else if (temp == 5) {
            System.out.println("This is a good time to make a bbq and possibly swim in the lake!");
        }
    }

    public static void Cloudy(int temp) {
        if (temp == 1) {
            System.out.println("It would be the best to stay at home when it is this cold! Watching movies sounds fun!");
        } else if (temp == 2) {
            System.out.println("You could go to the cinema.");
        } else if (temp == 3) {
            System.out.println("Visit a Botanical Garden.");
        } else if (temp == 4) {
            System.out.println("You could go hiking in the woods, or for a bike ride.");
        } else if (temp == 5) {
            System.out.println("This is a good time to have a picnic!:)");
        }
    }

    public static void Rainy(int temp) {
        if (temp == 1) {
            System.out.println("It would be the best to stay at home when it is this cold! Game night sounds fun!");
        } else if (temp == 2) {
            System.out.println("Make some nice food, invite some friends over and enjoy!");
        } else if (temp == 3) {
            System.out.println("Make DIY Science Experiments and have fun! :)");
        } else if (temp == 4) {
            System.out.println("Board Game Tournament :)");
        } else if (temp == 5) {
            System.out.println("Make an indoor picnic!");
        }
    }
}
