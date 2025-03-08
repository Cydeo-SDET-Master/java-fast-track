package day2;

public class Ex10VarArgs {
    public static void main(String[] args) {

        int[] a = {3, 5, 1, 5};
        System.out.println(first(a)); // if I can to call this method I need to create an array first, as I did on line 5. Then that array can be passed as the argument of the method

        System.out.println(last(3, 5, 1, 2, 6, 2)); // the last method is created with an int array argument, but it was created using the var args syntax which means the elements can be defined right in the parenthesis instead of needing to create an array first

        System.out.println(last(a)); // a normal array can still be accepted too
    }

    public static int first(int [] arr) {
        return arr[0];
    }

    public static int last(int ... arr){ // var arg used
        return arr[arr.length - 1];
    }


}
