public class Exercise23 {
    public static void main(String[] args) {
        String palindrome = "anavolimilovana";
        String reversed = "";
        for (int i = 0; i < palindrome.length(); i++) {
            reversed = palindrome.charAt(i) + reversed;
        }
        if (reversed.equals(palindrome)) {
            System.out.println("This word is a palindrome!");
        } else {
            System.out.println("The word is not a palindrome");
        }

    }
}
