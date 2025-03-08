package day2;

import java.util.Arrays;

public class Task2Anagram {

    /*
        Anagram

        Create a method that will determine if two Strings are anagrams of each other. An anagram is when the character of the words can be reordered to get a different word. Return boolean, true for anagram & false for not anagram

        Ex:
          listen
          silent

        The letters of the two words are the same, so they are anagram
    */

    public static boolean isAnagram(String one, String two) {

        if(one.length() != two.length()){
            return false;
        }

        char[] oneArr = one.toCharArray();
        char[] twoArr = two.toCharArray();

        Arrays.sort(oneArr);
        Arrays.sort(twoArr);
//        System.out.println(Arrays.toString(oneArr));
//        System.out.println(Arrays.toString(twoArr));

        return Arrays.equals(oneArr, twoArr);
    }

    public static boolean isAnagram2(String one, String two){
        if(one.length() != two.length()){
            return false;
        }

        for(int i = 0; i < one.length(); i++){
//            two = two.replaceFirst("" + one.charAt(i), "");
            two = two.replaceFirst(one.substring(i, i + 1), "");
        }
//        System.out.println(two);
        return two.isEmpty();
    }

    public static void main(String[] args) {
        String s = "listet";
        String s2 = "silent";

        System.out.println(isAnagram(s, s2));
        System.out.println(isAnagram2(s, s2));
    }


}
