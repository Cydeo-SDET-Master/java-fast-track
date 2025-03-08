package day1;

public class Ex04Variables {

    int z = 3; //instance/object variable

    public static void main(String[] args) {

        int a = 4;

        if(true) {
            int b = 23;
        } else {
            int c = 41;
            System.out.println(c); // what is accessible here
        }

        //System.out.println(b); ERROR

        for(int d = 0; d < 4; d++){
           System.out.println(d);
        }

        System.out.println(a);

        Ex04Variables obj = new Ex04Variables();
        System.out.println(obj.z);
    }

}
