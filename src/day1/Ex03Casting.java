package day1;

public class Ex03Casting {
    public static void main(String[] args) {

        // going from a smaller type (int) to a bigger type (long or double) does not need anything additional

        int i1 = 3;
        long l1 = i1;
        double d1 = i1;
        float f1 = 23L; // long to float (small to large)

        // going from a bigger type to a smaller type will require casting the variable to the specific type we want:

        /* INVALID
        int i2 = 4;
        byte b2 = i2;
        short s2 = i2;

        // or

        INVALID
        double d3 = 333.33;
        int i3 = d3;
        float f3 = d3;
        */

        // Both done with casting:
        int i2 = 4;
        byte b2 = (byte)i2;
        short s2 = (short)i2;
        short s22 = (byte)i2; // syntax wise works because you cast int to a byte type, which can be assigned to a short type automatically because byte is smaller than short.

        double d3 = 333.33;
        int i3 = (int)d3;
        float f3 = (float)d3;
        float f33 = (int)d3;
        float f333 = (long)d3;
        // similar to above, f33 or f333 both work by casting the double down to a smaller type, which is then automatically assigned to the bigger type of float

        long l4 = 1_000_000_000; // valid because the int 1,000,000,000 will be assigned to the bigger type variable
//        long l5 = 1_000_000_000_000; // adding 3 more zeros makes the number too big for int, which is the reason for compile issue - remember int is default type of numbers
//        long l5 = (long)(1_000_000_000_000); // casting does NOT help with this issue because the number itself is too big for the default int type
        long l5 = 1_000_000_000_000L; // the L is needed to be able to read the number as a long instead of an int

    }
}
