import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int max = Integer.MIN_VALUE;
        int nextInt = -1;
        while (scanner.hasNext() && nextInt != 0) {
            nextInt = scanner.nextInt();
            max = Math.max(max, nextInt);
        }
        System.out.println(max);
    }
}