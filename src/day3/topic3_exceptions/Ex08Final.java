package day3.topic3_exceptions;

public final class Ex08Final {

    static int a = 1;
    static final int b = 2; // Note: static final variables are referred to as constant variables

    void method1(){
        System.out.println("Default implementation");
    }

    final void method2(){
        System.out.println("Default implementation");
    }

}

//class Child extends Ex08Final {
//    public static void main(String[] args) {
//        Ex08Final.a = 10;
//        Ex08Final.b = 10;
//    }
//
//    @Override
//    void method1() {
//        System.out.println("Child implementation");
//    }
//    @Override
//    void method2() {
//        System.out.println("Child implementation");
//    }
//
//    @Override
//    protected void finalize() throws Throwable {
//        System.out.println("cleaning up");
//    }
//}
