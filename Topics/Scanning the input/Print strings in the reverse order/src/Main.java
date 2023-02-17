import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int numInputs = 3;
        String[] inputs = new String[numInputs];
        for (int i = 0; i < numInputs; i++) {
            inputs[i] = scanner.next();
        }
        for (int i = numInputs - 1; i >= 0; i--) {
            System.out.println(inputs[i]);
        }
    }
}