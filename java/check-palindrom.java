public class PalindromeChecker {
    public static boolean isPalindromeFunction(String input) {

        input = input.replaceAll("\\s", "").toLowerCase();
        
        int left = 0;
        int right = input.length() - 1;
        
        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }   
        return true; 
    }

    public static void main(String[] args) {
        String input = "A man a plan a canal Panama";
        boolean isPalindrome = isPalindromeFunction(input);
        
        if (isPalindrome) {
            system.out.println("The input is a palindrome.");
        } else {
            system.out.println("The input is not a palindrome.");
        }
    }
}