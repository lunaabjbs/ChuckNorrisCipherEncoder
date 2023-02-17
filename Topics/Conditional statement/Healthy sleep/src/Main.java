import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int minHoursForHealthySleep = scanner.nextInt();
        int maxHoursForHealthySleep = scanner.nextInt();
        int hoursAnnSleeps = scanner.nextInt();

        if (hoursAnnSleeps < minHoursForHealthySleep) {
            System.out.println("Deficiency");
        } else if (hoursAnnSleeps > maxHoursForHealthySleep) {
            System.out.println("Excess");
        } else {
            System.out.println("Normal");
        }
    }
}