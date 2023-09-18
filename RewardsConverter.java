import java.util.Scanner;

public class RewardsConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Credit Card Rewards Converter!");

        double cashValue;
        while (true) {
            System.out.print("Please enter a cash value to convert to airline miles: ");
            String input_value = scanner.nextLine();

            try {
                cashValue = Double.parseDouble(input_value);
                break; // Break out of the loop if parsing is successful.
            } catch (NumberFormatException exception) {
                System.out.println("Could not parse input value as a double. Please try again.");
            }
        }

        System.out.println("Converting $" + cashValue + " to miles");
        RewardValue rewardsValue = new RewardValue(cashValue);
        System.out.println("$" + cashValue + " is worth " + rewardsValue.getMilesValue() + " miles");

        scanner.close();
    }
}
