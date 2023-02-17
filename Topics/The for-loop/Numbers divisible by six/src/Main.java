import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int numsInSequence = scanner.nextInt();
        int accumulator = 0;
        for (int i = 0; i < numsInSequence; i++) {
            int currentNum = scanner.nextInt();
            if (currentNum % 6 == 0) {
                accumulator += currentNum;
            }
        }
        System.out.println(accumulator);
    }
}