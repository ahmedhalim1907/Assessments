package taskOne;


public class PalindromeCheck {
    public static void main(String[] args) {
        if (checkPalindrome("dad"))
            System.out.println("Your input is palindrome");
        else
            System.out.println("Your input is not palindrome");


    }

    public static boolean checkPalindrome(String input) {
        StringBuilder newInput = new StringBuilder(input);
        newInput.reverse();
        String reversedInput = newInput.toString();

        if (reversedInput.equals(input))
            return true;
        else
            return false;
    }

}
