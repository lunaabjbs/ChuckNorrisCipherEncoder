import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int int1 = scanner.nextInt();
        int int2 = scanner.nextInt();
        int int3 = scanner.nextInt();

        System.out.println((int1 >= int2 && int1 <= int3) || (int1 <= int2 && int1 >= int3));
    }
}