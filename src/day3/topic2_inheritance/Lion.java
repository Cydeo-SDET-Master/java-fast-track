package day3.topic2_inheritance;

public class Lion extends Animal{ // Lion is a Animal
    // Animal is the super class
    // Lion is the subclass

    int maneSize;
    Home home; // Lion has a Home

    public void roar() {
        super.eat();
        System.out.println("And roaring");
    }

}

