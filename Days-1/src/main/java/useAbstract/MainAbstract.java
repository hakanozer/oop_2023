package useAbstract;

public class MainAbstract {
    public static void main(String[] args) {

        Person person = new Person(100);
        String name = person.name();
        int total = person.total();
        System.out.println( name + " - " + total );

    }
}
