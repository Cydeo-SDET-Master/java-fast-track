package day2;

public class Ex01Methods {

    public static void main(String[] args) {
        int n = 4;
        if(n % 2 == 0) {
            System.out.println(n + " is even");
        } else {
            System.out.println(n + " is odd");
        }
    }
    // Q: is this main method reusable?

    /*
        would you need to try creating any of these from scratch?

        "hello".charAt(0);
        new Scanner(System.in).nextInt();
        driver.get();
     */

}
