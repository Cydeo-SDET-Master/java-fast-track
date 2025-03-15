package day4.topic1_encapsulation.access.a;

public class Red extends Color{
    public static void main(String[] args) {
        Red color = new Red(); // inherit in same package
        System.out.println(color.c); // access: a, b, & c
    }
}
