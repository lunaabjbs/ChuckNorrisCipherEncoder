import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int numInputs = 3;
        String[] inputs = new String[numInputs];
        for (int i = 0; i < numInputs; i++) {
            inputs[i] = scanner.nextLine();
        }
        System.out.println("The form for " + inputs[0] + " is completed."
        + " We will contact you if we need a chef who cooks " + inputs[2]
        + " dishes and has " + inputs[1] + " years of experience.");
    }
}