package day3.topic1_class_and_object;

public class Computer {

    String os;
    int ram;
    int storage;

    public Computer(String os) {
        this.os = os;
    }

    /*

    public Computer(String os, int ram) {
        this.os = os;
        this.ram = ram;
    }

    public Computer(String os, int ram, int storage) {
        this.os = os;
        this.ram = ram;
        this.storage = storage;
    }
    */

    public Computer(String os, int ram) {
        this(os);
        this.ram = ram;
    }

    public Computer(String os, int ram, int storage) {
        this(os, ram);
//        this("hello", -1340); it doesn't care what the values are. only checks the datatypes
        this.storage = storage;
    }

    /*
        without this:
        public Computer(String os, int ram) {
            os = "mac;
            ram = ram;
        }

        java prioritizes local variables, so the instance variables are not going to be changed here. The local variables from the parameters will be used. That is why this keyword helps to define which variables are instance variables
    */

    /*
        when constructors are overloaded they don't need to always be similar variables with one difference. Overloading is just changing parameters.
        Taking a look at the ArrayList constructors:
            new ArrayList();
            new ArrayList(int);
            new ArrayList(Collection);
     */

}
