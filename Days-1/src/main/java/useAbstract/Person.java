package useAbstract;

public class Person extends Customer{

    int number = 0;
    public Person( int number ) {
        this.number = number;
    }

    @Override
    public int accountNumber() {
        return number;
    }

}
