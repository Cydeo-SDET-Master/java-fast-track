package day2;

public class Ex02Methods {

    // void method

    public static void method1(){
        System.out.println("Hello World");
    }

    // return method
    public static String method2(){
        return "Hello Universe";
    }

    // parameters

    public static void method3(String s) {
        System.out.println(s.length());
    }

    public static int method4(String s) {
        return s.length(); // can be any int type
    }

    // instance method
    public void method5(){
        System.out.println("Java is fun");
    }

    // return in void
    public static void method6(int n){

        if(n < 0){
            return;
        }

        for(int i = 0; i < n; i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        method1(); // void method, so nothing is returned, no need for anything else
        method2(); // this method runs and returns a String. That String that is returned is not used anywhere
        System.out.println(method2());
        String str = method2();
        // both of the above are possible uses of the return value for method2. The method doesn't care how the return value is used, or even if it is used. The method will run and give a value back. it is up to you to use the data

        // comparing method1 and method2: method1 will only print, so it is not possible to reuse the String to somewhere else. method2 returns the value, so it is more flexible how we can use that String
        System.out.println("--------------------------------------------------");
        //method3(); method3 has a String parameter, so a String must be given when calling the method, otherwise the program will not compile
        method3("java");
        method3(""); // it doesn't care what characters are given. We need to just give a String datatype
        String s = "candy";
        method3(s); // giving the String as a variable
        System.out.println("--------------------------------------------------");
        // notice we named the variable 's' which is allowed because the 's' variable from method3 is the parameter, which means it is local to that code block

        // the parameter of the method3 is String type named 's'. It is used in the method however needed
        // the argument comes from calling the method and giving a String. The arguments above were: "java", "", and "candy" (from String variable)

        System.out.println(method4("computer")); // void or return type doesn't alter how the parameter works

        // if a method has multiple parameters, which would be defined seperated by commas, then multiple arguments need to be given when calling the method. The order of those arguments must match

        // Method 1 - 4 were static method, so we are able to call them without extra steps - that is because we were in the same class. If we were outside the class we created them we could still access using the className.method(). For method5 we will need to create an instance first, then we can call the method

        //method5(); cannot call an instance method like this
        new Ex02Methods().method5(); // instance of the class created first, then method5 can be called

        System.out.println("--------------------------------------------------");
        method6(5);
        method6(-2);


    }
}
