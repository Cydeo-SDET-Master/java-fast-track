package day2;

public class Ex11Recursion {
    public static void main(String[] args) {
        int a = fibonacci(8);
        System.out.println(a);
    }

    public static int fibonacci(int n) {
        if (n < 2) return n;
        return fibonacci(n - 2) + fibonacci(n - 1);
    }
}
