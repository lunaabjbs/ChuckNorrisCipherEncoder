import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int poleHeight = scanner.nextInt();
        int feetUpPerDay = scanner.nextInt();
        int feetDownPerDay = scanner.nextInt();

        int numDays = 1;
        int currentHeight = 0;
        while (currentHeight < poleHeight) {
            currentHeight += feetUpPerDay;
            if (currentHeight >= poleHeight) {
                break;
            }
            currentHeight -= feetDownPerDay;
            numDays++;
        }
        System.out.println(numDays);
    }
}