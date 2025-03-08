package day3.topic2_inheritance;

public class Ex04Static {
    public static void main(String[] args) {
        System.out.println(Season.planet);
        System.out.println(Winter.planet);

        Winter.planet = "Mars";

        System.out.println(Season.planet);
        System.out.println(Winter.planet);

    }
}

class Season {
    static String planet = "Earth";
}
class Winter extends Season{

}
