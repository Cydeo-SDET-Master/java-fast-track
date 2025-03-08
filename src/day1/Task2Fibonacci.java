package day1;

public class Task2Fibonacci {

    /*
        Fibonacci

        Create a program that will give you the Nth Fibonacci number where N is an int
        Fibonacci is a sequence of number starting from 0, 1 where the following numbers are the sum of the previous 2 numbers
    Note: Fibonacci numbers are read like index values, so the 0th Fibonacci is 0, 1st value is 1, 2nd value is 1, etc

        Ex:
            input:
                8
            output:
                21

            -> ex of the sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21

        Test data:
            n -> result
            0 -> 0
            1 -> 1
            2 -> 1
            3 -> 2
            6 -> 8
            8 -> 21
    */

    public static void main(String[] args) {

        int n = 5;

        int first = 0;
        int second = 1;

        for(int i = 2; i <= n; i++){
            int next = first + second;
            first = second;
            second = next;
        }

        if(n == 0){
            System.out.println(first);
        } else {
            System.out.println(second);
        }

    }
}
