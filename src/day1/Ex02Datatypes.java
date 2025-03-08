package day1;

import java.math.BigDecimal;
import java.util.Scanner;

public class Ex02Datatypes {
    public static void main(String[] args) {

        // primitive datatypes
        byte a;
        short b;
        int c;
        long d;
        float e;
        double f;
        boolean g;

        // non-primitive datatypes: Objects
        String h;
        Scanner i;

        System.out.println("Ranges");
        System.out.println("Byte: " + Byte.MIN_VALUE + " <-> " + Byte.MAX_VALUE);
        System.out.println("Short: " + Short.MIN_VALUE + " <-> " + Short.MAX_VALUE);
        System.out.println(" * Int: " + Integer.MIN_VALUE + " <-> " + Integer.MAX_VALUE);
        System.out.println("Long: " + Long.MIN_VALUE + " <-> " + Long.MAX_VALUE);
        System.out.println("Float: " + Float.MIN_VALUE + " <-> " + Float.MAX_VALUE);
        System.out.println(" * Double: " + Double.MIN_VALUE + " <-> " + Double.MAX_VALUE);

        System.out.println(new BigDecimal(Double.MAX_VALUE));

        // int and double are the default types
        int i1 = 4;
        long i2 = 5; // 5 here is int, but int is smaller than long, so it will automatically cast to bigger type
        long i3 = 10L; // 10 here is a long datatype because of the L
        //  long i4 = 100000000000; this doesn't compile because 100000000000 is too big for an int type. It is int here because int is the default type for numbers, the variable type being long doesn't change anything at that point.
        long i5 = 100000000000L; // this is different from the previous line because the 100000000000 is now being seen as a long type, and that number is a valid long number so the program can compile and assign the value of i5 variable to be the defined number

        double i6 = 133.3;
        // float i7 = 123.4; // 123.4 is a double type by default. double is bigger than float so a double type cannot be stored into a float variable automatically
        float i8 = 123.4F; // adding the F to 123.4 makes it a float type, so it can be assigned to a float variable

    }
}
