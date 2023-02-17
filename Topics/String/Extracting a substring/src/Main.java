import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String input1 = scanner.next();
        int input2 = scanner.nextInt();
        int input3 = scanner.nextInt();

        System.out.println(input1.substring(input2, input3 + 1));
    }
}