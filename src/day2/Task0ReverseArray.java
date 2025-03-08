package day2;

import java.util.Arrays;

public class Task0ReverseArray {

    public static void main(String[] args) {
        int[] n = {2,3,4,5};
        System.out.println(Arrays.toString(reverseArray(n)));
    }

    //{2,3,4,5} -> {5,3,4,5}
    public static int[] reverseArray(int[] nums) {
        for (int i = 0, j = nums.length-1; i < nums.length/2 ; i++, j--) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        return nums;
    }
}
