package day1;

public class Ex08String {
    public static void main(String[] args) {

        String a = "Hello World";
        String a2 = new String("Hello World");
        System.out.println(a == a2);
        System.out.println(a.equals(a2));
        System.out.println(a == "Hello World");
        System.out.println(a2 == "Hello World");

        System.out.println("------------------------------------------------------");

//        a + "!"; doesn't change the String
        System.out.println(a.substring(2,5)); // method gives a String back, but it will not change the original String
        System.out.println(a);

        System.out.println("------------------------------------------------------");

        String s2 = "Java";
        System.out.println(s2 + 3 + 5);
        System.out.println( 3 + 5 + s2);
        System.out.println(s2);

        System.out.println("------------------------------------------------------");

        String str = "Water";
        str += " Fountain"; // creates a new String with the new String concatenated at the end. That new String is then reassigned back to the original reference
        System.out.println(str);

        StringBuilder strB = new StringBuilder("Lemon"); // There is only one object
        System.out.println(strB);
        strB.append(" Juice");
        System.out.println(strB);
        strB.append(" is good");
        System.out.println(strB);
        strB.toString(); // Converts the StringBuilder object to a String type

        StringBuffer buff = new StringBuffer("Keyboard");
        buff.append(" & mouse");
        buff.append(". New computer");
        System.out.println(buff); // looks the same as StringBuilder, but is thread safe

    }
}
