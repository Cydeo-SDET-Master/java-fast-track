package day4.topic1_encapsulation.examples;

public class Runner {
    public static void main(String[] args) {

        Records records = new Records();
        records.setInfo("Gold Record");
        System.out.println(records.getInfo());
        //System.out.println(records.info); ERROR
        Records r = new Records();
        r.setInfo(" ");
        System.out.println(r.getInfo());
        r.setInfo("java SDET jobs record");
        System.out.println(r.getInfo());

        Person person = new Person("New York");
        System.out.println(person.getBirthLocation());
       // System.out.println(person.birthLocation);
        //person.setBirthLocation("PA"); //no setters in Person class
        //new object with different value
        person = new Person("PA");
        System.out.println(person.getBirthLocation());

        Budget budget = new Budget();
        budget.setAnnualBudget(100_000_000);
        // other methods here
        // there is no getter, so we will never be able to read(get) the value

    }
}
