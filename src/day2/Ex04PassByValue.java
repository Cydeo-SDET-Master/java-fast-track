package day2;

import java.util.Arrays;

public class Ex04PassByValue {

    public static void main(String[] args) {

        int a = 3;
        System.out.println(doubleN(a));
        System.out.println(a);

        System.out.println("----------------------------------------------");

        int[] arr = {4, 5, 15};
        System.out.println(Arrays.toString(doubleN(arr)));
        System.out.println(Arrays.toString(arr));
        System.out.println("----------------------------------------------");

        int[] arr2 = {4, 5, 15};
        System.out.println(Arrays.toString(changeN(arr2)));
        System.out.println(Arrays.toString(arr2));
        
    }

    public static int doubleN(int n){
        n *= 2;
        return n;
    }
    public static int[] doubleN(int[] arr){
        for(int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
        }
        return arr;
    }

    public static int[] changeN(int [] arr){
        arr = new int[]{5, 5, 1, 2}; // if java was pass by reference the array in the main method would also be changed
        return arr;
    }

}
