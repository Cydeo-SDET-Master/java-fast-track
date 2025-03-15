package day4.topic1_encapsulation.access.a;

public class Paint {
    public static void main(String[] args) {
        Color color = new Color(); // direct access, same package
        System.out.println(color.c); // access: a, b, c
    }
}
