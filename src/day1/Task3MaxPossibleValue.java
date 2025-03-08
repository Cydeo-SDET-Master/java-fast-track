package day1;

public class Task3MaxPossibleValue {

    /*
        Maximum Possible Value

        Create a program that will print the maximum possible value of the given number N by inserting the digit '5' somewhere in the integer.

        > bounds of N: -8,000 - 8,000

        Ex:
            Given N = 268, the program should return 5268
            Given N = 670, the program should return 6750
            Given N = 0, the program should return 50
            Given N = -999, the program should return -5999

            test values: 268, 670, 678, 839, -999, -490, -400
     */

    /*
        less than 5 -> added in the beginning
        more than 5 -> kept checking
            -> until the end all were more than 5 -> 5 is added to end

        when negative flip above

        one digit - one number at a time

     */

    public static void main(String[] args) {

        int n = 999;
        boolean isPos = n > 0;
        String digits = String.valueOf(Math.abs(n)); // abs -> absolve value of the number (ignore negative)  then converts the number to a String type

        int max = 0;

        for(int i = 0; i < digits.length(); i++){
            char eachDigit = digits.charAt(i);

            if((isPos && eachDigit < '5') || (!isPos && eachDigit > '5')){
                max = Integer.parseInt( digits.substring(0, i) + 5 + digits.substring(i));
                break;
            }
        }

        if(max == 0) {
            max = Integer.parseInt(digits + 5);
        }

        System.out.println(isPos ? max : max * -1);


    }

}
