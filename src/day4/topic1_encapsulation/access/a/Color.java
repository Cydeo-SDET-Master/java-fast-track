package day4.topic1_encapsulation.access.a;

public class Color { // original class
    public int a;
    protected int b;
    int c;
    private int d;

    public static void main(String[] args) {
        Color color = new Color(); // direct access, same class
        System.out.println(color.d); // can access all 4 variables: a, b, c, d
    }
}
