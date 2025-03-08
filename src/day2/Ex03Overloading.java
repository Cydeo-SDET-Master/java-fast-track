package day2;

public class Ex03Overloading {

    // without any overloading:

    public static void buyByType(String type) {
        System.out.println("Looking for " + type);
    }

    public static void buyByPrice(double price) {
        System.out.println("Looking in range " + price);
    }

    public static void buyByZipcode(int zipcode) {
        System.out.println("Looking in zipcode " + zipcode);
    }

    public static void buyByRooms(byte rooms) {
        System.out.println("Looking " + rooms + " rooms");
    }

    // without overloading there is 4 separate method names that would need to be used and remembered

    // with overloading

    public static void buy(String type) {
        System.out.println("Looking for " + type);
    }

    public static void buy(double price) {
        System.out.println("Looking in range " + price);
    }

    public static void buy(int zipcode) {
        System.out.println("Looking in zipcode " + zipcode);
    }

    public static void buy(byte rooms) {
        System.out.println("Looking " + rooms + " rooms");
    }

    // taking those same method but overloading them with the same name allows the above methods to be grouped better. There is still 4 methods that can do slightly different things, but they had a similar idea so overloading allowed them to share one name and different parameters

    /*
        "".substring()
        "".indexOf()
        System.out.println()
        Arrays.toString()
     */

    public static void main(String[] args) {
        //  buy(); the arguments determine which method will be executed
    }

    // trying to overload by changing the return type

    public static void start(boolean check){

    }
//    public static int start(boolean check){}

//  changing the return type DOES NOT overload the method

    // if a method is overloaded properly first by changing the parameters, then it is possible change the return type if needed
    public static int start(int time){
        return 0;
    } // by changing the parameter to a int type the method is overloaded, and because it is overloaded it is possible to change the return type

}

