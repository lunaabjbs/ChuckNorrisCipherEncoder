import java.util.List;
import java.util.Scanner;
import java.util.Stack;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        Stack<String> names = new Stack<>();
        while (scanner.hasNext()) {
            names.push(scanner.next());
        }
        while (!names.empty()) {
            System.out.println(names.pop());
        }
    }
}