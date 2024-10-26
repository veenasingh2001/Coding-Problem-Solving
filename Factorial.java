import java.util.Scanner;

class Factorial {
    // Method to calculate factorial recursively
    static int factorial(int n) {
        if (n == 0 || n == 1) // Base case: 0! = 1 and 1! = 1
            return 1;
        else
            return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to calculate its factorial: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            int result = factorial(n);
            System.out.println("Factorial of " + n + " is " + result);
        }

        scanner.close();
    }
}
