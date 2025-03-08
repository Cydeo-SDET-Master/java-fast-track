package day1;

public class Ex06Conditional {
    public static void main(String[] args) {

        int day = 2;

        if (day < 1 || day > 7) {
            System.out.println("Invalid day");
        }

        if (day < 1 || day > 7) {
            System.out.println("Invalid day");
        }else {
            System.out.println("Valid day - " + day);
        }

        /*
        without brackets
        if(day < 1 || day > 7)
            System.out.println("Invalid day");
         */

        if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else if (day == 7) {
            System.out.println("Sunday");
        }

        System.out.println("------------------------------------------------------");

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }

        System.out.println("----- Enhanced Switch ------");
        
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid day");
        }

        System.out.println("------------------------------------------------------");

        System.out.println( day == 1 ? "Monday" : day == 2 ? "Tuesday" : day == 3 ? "Wednesday" : day == 4 ? "Thursday" : day == 5 ? "Friday" : day == 6 ? "Saturday" : "Sunday");
        
        int count = 10;
        String result = count > 5 ? "Pass" : "Fail";
        System.out.println("result = " + result);
        
    }
}
