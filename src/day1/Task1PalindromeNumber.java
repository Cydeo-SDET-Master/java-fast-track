package day1;

public class Task1PalindromeNumber {

    /*
        Palindrome Number

        Create a program that will check if the given number is palindrome.
        A number is palindrome if the digits are the same read forwards and backwards.
        Do not use a String

        Ex:
            Given n = 1234321 -> palindrome
            Given n = 15651 -> palindrome
            Given n = 18374 -> not palindrome
            Given n = 1264628 -> not palindrome
     */

    public static void main(String[] args) {

        int n = 12321;
        int orig = n;
        int reverse = 0;

        while(n > 0){
            int lastDigit = n % 10; // reads the last digit in the number
            reverse = reverse * 10 + lastDigit;
            n /= 10;
        }

        System.out.println(orig + " " + (reverse == orig ? "Palindrome" : "Not Palindrome"));




    }




}
