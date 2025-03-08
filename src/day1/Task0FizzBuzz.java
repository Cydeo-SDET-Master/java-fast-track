package day1;

public class Task0FizzBuzz {
    public static void main(String[] args) {
        /*
        1-100 -> "FizzBuzz" -> divisible by 3 and 5
              -> "Fizz"-> divisible by 3
              -> "Buzz"-> divisible by 5
              -> print number itself(as a string)
         */
        for (int i = 1; i <= 100 ; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i+"");
            }
        }
    }
}
