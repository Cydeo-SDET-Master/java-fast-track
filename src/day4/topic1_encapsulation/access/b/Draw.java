package day4.topic1_encapsulation.access.b;

import day4.topic1_encapsulation.access.a.Color;

public class Draw {
    public static void main(String[] args) {
        Color color = new Color(); // direct access, different package
        System.out.println(color.a); // access only a
    }
}
