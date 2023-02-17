import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int input = scanner.nextInt();
        while (input != 1) {
            System.out.print(input + " ");
            if (input % 2 == 0) {
                input /= 2;
            } else {
                input = input*3 + 1;
            }
        }
        System.out.print(input);
    }
}