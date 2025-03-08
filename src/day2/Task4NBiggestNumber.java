package day2;

import java.util.ArrayList;
import java.util.Arrays;

public class Task4NBiggestNumber {

    /*
        N Biggest Number

        Create a method that will find the n biggest number from an array of numbers.
         if n is 1 find the 1st biggest number
         if n is 2 find the 2nd biggest number
         etc..

         Ex:
            input:
                {3, 1, 5, 2, 5, 7, 23, 6, 2, 1, 7}
                n = 2
            output:
                7 -> 7 is the 2nd biggest
            ---------------

            input:
                {3, 1, 5, 2, 5, 7, 23, 6, 2, 1, 7}
                n = 4
            output:
                5 -> 5 is the 4th biggest (23, 7, 6, 5)

     */

    public static int quick(int n, int... arr){
        Arrays.sort(arr);
        return arr[arr.length - n];
    }

    public static int nBiggestNum(int n, int... arr){ // 3, 1, 5, 2, 5, 7, 23, 6, 2, 1, 7

        ArrayList<Integer> max = new ArrayList<>(); // 7, 5, 5, 3, 2, 1, 0
        max.add(0);

        for(int each : arr){

            if(max.contains(each)){
                continue;
            }

            if(each > max.get(0)){
                max.add(0, each);
            } else {
                for(int i = 1; i < max.size(); i++){
                    if(each > max.get(i)){
                        max.add(i, each);
                        break;
                    }
                }
            }
        }
        return max.get(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(nBiggestNum(1, 3, 1, 5, 2, 5, 7, 23, 6, 2, 1, 7));
        System.out.println(nBiggestNum(2, 3, 1, 5, 2, 5, 7, 23, 6, 2, 1, 7));
        System.out.println(nBiggestNum(3, 3, 1, 5, 2, 5, 7, 23, 6, 2, 1, 7));
        System.out.println(nBiggestNum(4, 3, 1, 5, 2, 5, 7, 23, 6, 2, 1, 7));
        System.out.println(nBiggestNum(5, 3, 1, 5, 2, 5, 7, 23, 6, 2, 1, 7));
    }



}
