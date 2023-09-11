package useAbstract;

public abstract class Customer {

    public abstract int accountNumber();

    public int total() {
        int number = accountNumber();
        if (number == 100) {
            return 1000000;
        }else if ( number == 200 ) {
            return 2000000;
        }else {
            return 0;
        }
    }

    public String name() {
        int number = accountNumber();
        if (number == 100) {
            return "Ali Bilmem";
        }else if ( number == 200 ) {
            return "Veli Bilirim";
        }else {
            return "";
        }
    }

}
