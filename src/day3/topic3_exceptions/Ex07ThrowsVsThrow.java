package day3.topic3_exceptions;

public class Ex07ThrowsVsThrow {
    public static void main(String[] args) throws Exception{

        method1(22);

        method2(4);
    }

    public static void method1(int n) {
        if(n < 0){
            throw new ArithmeticException("No Negative Numbers Allowed");
        }
        System.out.println(n);
    }

    public static void method2(int n) throws Exception{
        if(n % 2 == 0){
            throw new Exception("Even Number");
        }
    }

}
