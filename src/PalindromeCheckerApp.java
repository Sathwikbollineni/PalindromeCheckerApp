public class PalindromeCheckerApp {
    public static void main(String[] args) {


                // Hardcoded string
                String word = "madam";
        System.out.println("input text:"+word);
                // Assume it is palindrome
                boolean isPalindrome = true;

                // Compare characters from both ends
                for (int i = 0; i < word.length() / 2; i++) {
                    if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                        isPalindrome = false;
                        break;
                    }
                }

                // Print result using if-else
                if (isPalindrome) {
                    System.out.println( " is it a Palindrome?:true.");
                } else {
                    System.out.println(" is NOT a Palindrome? :false.");

                            String original = "madam";   // Input string
                            String reversed = "";        // To store reversed string

                            // Reverse string using for loop
                            for (int i = original.length() - 1; i >= 0; i--) {
                                reversed = reversed + original.charAt(i);
                            }

                            // Compare original and reversed string
                            if (original.equals(reversed)) {
                                System.out.println("The string is a palindrome.");
                            } else {
                                System.out.println("The string is not a palindrome.");
                            }
                        }
                    }
                }
