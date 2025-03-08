package day2;

import java.util.Arrays;
//https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Arrays.html

public class Ex07ArraysClass {

    public static void main(String[] args) {
        int [] arr = {5, 1, 1, 5, 2};

        // the array objects don't work exactly the same as other object types. They don't have a class that is able to define methods to be used on the object

        // There is the Arrays class which is a utility class offering methods for array objects

        System.out.println(arr);
        System.out.println(Arrays.toString(arr)); // print the array in a readable String format

        System.out.println("----------------------------------------");

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("----------------------------------------");

        System.out.println(Arrays.equals(arr, new int[]{1, 1, 2, 5, 5}));
        System.out.println(Arrays.equals(arr, new int[]{1, 1, 2, 5, 6}));

        System.out.println("----------------------------------------");

        int [] copy = Arrays.copyOf(arr, arr.length + 2);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(copy));

        System.out.println("----------------------------------------");

        System.out.println(Arrays.binarySearch(arr, 1));
        System.out.println(Arrays.binarySearch(arr, 5));
        System.out.println(Arrays.binarySearch(arr, 10));

    }
}
