import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int durationInDays = scanner.nextInt();
        int foodCostPerDay = scanner.nextInt();
        int oneWayFlightCost = scanner.nextInt();
        int oneNightInHotelCost = scanner.nextInt();
        int numberOfNights = durationInDays - 1;

        System.out.println((durationInDays * foodCostPerDay)
                + (2 * oneWayFlightCost)
                + (numberOfNights * oneNightInHotelCost));
    }
}