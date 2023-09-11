package inheritance;

public class Base {

    int number = 0;

    public Base() {
        System.out.println("Base Call");
    }

    public Base(int number) {
        this.number = number;
    }

    public void call() {
        action(0,0);
    }

    public void action( int a, int b ) {
        int sum = a + b + number;
        System.out.println("Sum: " + sum);
    }

}
