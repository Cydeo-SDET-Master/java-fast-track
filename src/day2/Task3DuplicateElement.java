package day2;

import java.util.ArrayList;
import java.util.Arrays;

public class Task3DuplicateElement {

        /*
            Duplicates Elements

            Create a method that will take an array of numbers and return all the elements that are duplicates values.
            The result should only include one occurrence of the duplicates

            Ex:
                Input:
                    {1, 3, 5, 1, 9, 5, 9, 6, 4}
                Output:
                    {1, 5, 9}
        */


    public static int[] findDup(int... arr){

        int[] dups = new int[arr.length]; // this could also be an arraylist
        int index = 0;
        ArrayList<Integer> checked = new ArrayList<>();

        for(int each : arr){

            if(checked.contains(each)){
                continue;
            }

            int count = 0;
            for(int other : arr){
                if(each == other){
                    count++;
                }
            }

            if(count > 1){
                dups[index++] = each;
                checked.add(each);
            }
        }

        return Arrays.copyOf(dups, checked.size());
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findDup(1, 3, 5, 1, 9, 5, 9, 6, 4)));
    }


}
