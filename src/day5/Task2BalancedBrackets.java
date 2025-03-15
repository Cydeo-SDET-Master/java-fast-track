package day5;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Task2BalancedBrackets {

    /*
        BalancedBrackets

        Create a method that will accept a String of brackets. Determine if the brackets are balanced. Brackets are balanced if there is a closing bracket for every corresponding opening bracket. There should not be any extra opening or closing bracket

        Ex:
        {([])} -> balanced
        {[(])} -> not balanced

     */

    public static boolean balanced(String str) { // {([])

        Map<Character, Character> map = new HashMap<>();
        map.put('{', '}');
        map.put('(', ')');
        map.put('[', ']');

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < str.length(); i++){

            char eachChar = str.charAt(i);

            if(map.containsKey(eachChar)){ // is the current character an opening bracket
                stack.push(eachChar);
            } else { // the current character is a closing bracket

                if(stack.isEmpty() || map.get(stack.pop()) != eachChar){ // stack.pop() -> gives the key
                    return false; // the opening bracket did not match with the closing bracket
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(balanced("{([])}"));
        System.out.println(balanced("{([{])}"));
        System.out.println(balanced("(((())))"));
        System.out.println(balanced("{{}}([])"));
    }

}
