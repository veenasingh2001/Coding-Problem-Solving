public class PalindromeString {

    public boolean isPalindrome(String input) {
        if (input == null || input.isEmpty()) {
            return true;
        }

        int length = input.length();
        for (int i = 0; i < length / 2; i++) {
            if (input.charAt(i) != input.charAt(length - i - 1)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a string as a command-line argument.");
            return;
        }

        String input = args[0];
        PalindromeString checker = new PalindromeString();

        if (checker.isPalindrome(input)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
