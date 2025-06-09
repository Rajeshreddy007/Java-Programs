import java.util.*;

public class calculator {
    public static void main(String[] args) {
        System.out.println("Welcome to Calculator Application");
        int n = 0;
        try (Scanner sc = new Scanner(System.in)) {
            while (n != 5) {
                System.out.println("\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Exit");
                System.out.print("Enter option: ");
                n = sc.nextInt();

                if (n == 5) {
                    System.out.println("Exiting... Thank you!");
                    break;
                }

                System.out.print("Enter A and B values: ");
                int a = sc.nextInt();
                int b = sc.nextInt();

                switch (n) {
                    case 1:
                        System.out.println("Addition: " + (a + b));
                        break;
                    case 2:
                        System.out.println("Subtraction: " + (a - b));
                        break;
                    case 3:
                        System.out.println("Multiplication: " + (a * b));
                        break;
                    case 4:
                        if (b == 0) {
                            System.out.println("Error: Division by zero is not allowed.");
                        } else {
                            System.out.println("Division: " + (a / b));
                        }
                        break;
                    default:
                        System.out.println("Enter a valid option (1-5).");
                }
            }
        }
    }
}
