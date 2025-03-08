package day2;

public class Task1MethodMiniTasks {

    // create methods for each of the following mini tasks:
    //------------------------------------------------------------

    public static void main(String[] args) {
        System.out.println(cube(2));
        System.out.println(cube(4));
        System.out.println(vowels("abcde"));
        System.out.println(vowels("zyxbm"));
        System.out.println(nextHour("1:15"));
        System.out.println(nextHour("11:57"));

        System.out.println(capitalize("java is cool. i LOVE to program. i want TO KEEP LEARNING."));
        System.out.println(capitalize2("java is cool. i LOVE to program. i want TO KEEP LEARNING."));
    }

    // create a method that will accept a number and return the cube of that given number. 2 cubed is 2 * 2 * 2 = 8

    public static int cube(int n){
        return n * n * n;
    }

    // create a method that will accept a String and count how many vowels the String has

    public static int vowels(String str){
        int count = 0;
        for(char eachChar : str.toCharArray()){
            if(eachChar == 'a' || eachChar == 'e' || eachChar == 'i' || eachChar == 'o' || eachChar == 'u'){
                count++;
            }
        }
        return count;
    }

    /*
        public static int vowels(String str){
        String vowels = "aeiou"
        int count = 0;
        for(char eachChar : str.toCharArray()){
            if(vowels.contains("" + eachChar){
                count++;
            }
        }
        return count;
    }

     */
    // create a method that will accept a time in String format and return how many minutes are left until the next hour. The time will be given in this format: hh:mm

    public static int nextHour(String time){
        int minutes = Integer.parseInt( time.substring( time.indexOf(":") + 1) );
        return 60 - minutes;
    }

    // create a method that will accept a String and capitalize the String properly. Only the first character in the beginning of the sentence should be capitalized. A sentence can be determined by a ". "
    // Hint: split method uses regex -> "\\" for regex can be used to evaluate the exact characters, instead of regex syntax. If the split method is not clear try with iterative approach

    public static String capitalize(String str){

        String[] sentence = str.split("\\. ");
        String fixed = "";
        for(String each : sentence){
            fixed += each.substring(0,1).toUpperCase() + each.substring(1).toLowerCase() + ". ";
        }
        return fixed.replace(".. ", ".");
    }

    public static String capitalize2(String str){

        String fixed = "";

        while(str.contains(".")){
            String sentence = str.substring(0, str.indexOf(".") + 1);
            fixed += sentence.substring(0,1).toUpperCase() + sentence.substring(1).toLowerCase();
            str = str.replace(sentence, "");

        }
        return fixed.trim();
    }


}
