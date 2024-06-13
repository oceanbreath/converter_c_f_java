public class Main {
    public static void main(String[] args) {

        boolean exit = false;
        String selection;

        while (!exit) {
            System.out.println("*******  " + "\u001B[34m" + "Temperature  convert" + "\u001B[0m" + "  *******");
            System.out.println("**  "+ "\u001B[34m" + "1 - from Celsius to Fahrenheit" + "\u001B[0m" + "  **");
            System.out.println("**  "+ "\u001B[34m" + "2 - from Fahrenheit to Celsius" + "\u001B[0m" + "  **");
            System.out.println("**  "+ "\u001B[34m" + "any other key - exit"+ "\u001B[0m" + "            **");
            System.out.println("**************************************");

            selection = UserInput.selectMenu("Input your choice: ");
            if (selection.equals("1")) {
                double fahrenheit = Converter.celsiusToFahrenheit(UserInput.inputTemperature("Enter temperature in Celsius: "));
                System.out.println("Temperature in Fahrenheit: " + fahrenheit + "\n");
            } else if (selection.equals("2")) {
                double celsius = Converter.fahrenheitToCelsius(UserInput.inputTemperature("Enter temperature in Fahrenheit: "));
                System.out.println("Temperature in Celsius: " + celsius + "\n");
            } else {
                System.out.println("Exiting...");
                exit = true;
            }
        }

        UserInput.closeScanner();
    }
}
