import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int length = scanner.nextInt();
        int width = scanner.nextInt();
        int segmentsToDetach = scanner.nextInt();

        if ((segmentsToDetach % length == 0 && segmentsToDetach < length*width)
                || (segmentsToDetach % width == 0 && segmentsToDetach < length*width)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}