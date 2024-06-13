import java.util.Scanner;

public class UserInput {
    private static Scanner scanner = new Scanner(System.in);

    public static String selectMenu(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public static double inputTemperature(String prompt) {
        double temperature;
        while (true) {
            System.out.print(prompt);
            try {
                temperature = Double.parseDouble(scanner.nextLine());  // Read user input
            } catch (Exception e) {
                //System.out.println(e);
                continue;
            }
            return temperature;
        }
    }

    public static void closeScanner() {
        scanner.close();
    }

}
