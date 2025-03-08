package day1;

public class Ex04Variables {

    int z = 3;

    public static void main(String[] args) {

        int a = 4;

        if(true) {
            int b = 23;
        } else {
            int c = 41;
            System.out.println(c); // what is accessible here
        }

        for(int d = 0; d < 4; d++){
           System.out.println(d);
        }

       System.out.println(a);

    }

}
