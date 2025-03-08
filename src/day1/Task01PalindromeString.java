package day1;

public class Task01PalindromeString {

    public static void main(String[] args) {
        System.out.println(isPalindrome("Anna"));
        System.out.println(isPalindrome("java"));
    }

    public static boolean isPalindrome(String str) {
        String reversed = "";
        for (int i = str.length()-1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return str.equalsIgnoreCase(reversed);
    }
}
