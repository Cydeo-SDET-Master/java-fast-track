package day3.topic1_class_and_object;

public class Ex01ClassAndObject {

    public static void main(String[] args) {

        Book book1 = new Book(500, "James"); // Here we create an object from the Book class
        // We can create as many object as we need. Each object will be a copy of the blueprint of the defined Book class

        //instance variables are only accessible by an object of the class
        System.out.println(book1.length);
        System.out.println(book1.author);

        // These are invalid attempts to access the instance variables:
        /*
            System.out.println(length);
            System.out.println(author);
            System.out.println(Book.length);
            System.out.println(Book.author);
         */

        System.out.println(Book.publisher); // to access static members the class is used

        //System.out.println(book1.publisher); // an object belongs to the class, so all objects share the same static members. This allows static members to be access via object references, but it is not recommended

        System.out.println(new Book(341, "Ana").length); // This is showing that each object created has its own copy of the variables
        // Note: Here we are creating an object without a reference which mean after this line that object is not accessible

        Book.entertainment();
        //book1.entertainment();

        book1.read();
        new Book(230, "Kelly").read();


    }

}
