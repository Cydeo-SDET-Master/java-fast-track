package day3;

public class TaskArmstrong {
    /*
        Armstrong

        Create a method to check if a number is an Armstrong number
            parameter: int
            return: boolean

        An armstrong number is a number that's digits can be raised to the power of the total number of digits and summed to equal the original number

            -> these numbers are also called narcissistic numbers

        Ex:
            input: 153
            output: true

            the digits are 1, 5, and 3
            the calculation would be:
            1^3 + 5^3 + 3^3
                -> why is the exponent 3? because there is 3 digits in the number

            1^3 = 1 * 1 * 1 = 1
            5^3 = 5 * 5 * 5 = 125
            3^3 = 3 * 3 * 3 = 27

            1 + 125 + 27 = 153 --> the sum is equal to the original number so it is an armstrong number

        Test data:
            153 -> true
            371 -> true
            9474 -> true
            9475 -> false
            123 -> false
     */

    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
        System.out.println(isArmstrong(154));
        System.out.println(isArmstrong(371));
        System.out.println(isArmstrong(9474));

        System.out.println(isArmstrong2(154));
    }

    // 153
    public static boolean isArmstrong(int n) {

        String strN = String.valueOf(n); // "" + n
        int power = strN.length();
        int sum = 0;

        for(int i = 0; i < strN.length(); i++) {
            int digit = Integer.parseInt("" + strN.charAt(i));
            sum += Math.pow(digit, power);
//            System.out.println(sum);
        }

        return n == sum;
    }

    public static boolean isArmstrong2(int n) {

        int numOfDigits = 0;
        int temp = n;
        int sum = 0;

        while(temp > 0){
            numOfDigits++;
            temp /= 10;
        }

        temp = n;

        while(temp > 0){
            int eachDigit = temp % 10;
            temp /= 10;

           sum += Math.pow(eachDigit, numOfDigits);
        }
        return n == sum;
    }


}
