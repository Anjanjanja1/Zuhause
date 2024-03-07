public class Exercise17 {
    public static void main(String[] args) {
        exchangeCurrency("CZK", 100);
    }

    public static void exchangeCurrency(String currency, double euro) {
        switch (currency) {
            case "USD":
                double dollar = euro * 1.09;
                System.out.println(euro + " Euro is " + dollar + " American Dollars.");
                break;
            case "CZK":
                double Koruny = euro * 25.36;
                System.out.println(euro + " Euro is " + Koruny + " Czech Koruny.");
                break;
            case "HUF":
                double Forint = euro * 394.027;
                System.out.println(euro + " Euro is " + Forint + " Hungarian Forint.");
                break;
            case "PLN":
                double Zloty = euro * 4.30;
                System.out.println(euro + " Euro is " + Zloty + " Polish Zloty.");
                break;
        }
    }
}
