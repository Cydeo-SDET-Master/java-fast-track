package day2;

import java.util.Arrays;

public class Ex09MultidimensionalArray {
    public static void main(String[] args) {

        int[][] arr = new int[3][]; // first size defines how big the multidimensional array is (how many 1d array will be inside)
        // the second size is optional, but it can define the size of each inner 1d array. If it is left undefined each inner array can be different sizes

        System.out.println(Arrays.deepToString(arr));

        int[][] arr2 = {
                {3, 1, 1},
                {4, 5, 6, 7},
                {10, 15, 20}
        };

        System.out.println(Arrays.deepToString(arr2));

        for(int i = 0; i < arr2.length; i++) {
            for(int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("----------------------------------------");

        for(int[] eachArr : arr2){
            for(int eachElement : eachArr){
                System.out.print(eachElement + " ");
            }
            System.out.println();
        }


    }
}
