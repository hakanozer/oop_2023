package inheritance;

import oop.Profile;

public class A extends Base {

    Profile profile = new Profile();

    public A() {
        super(100);
        System.out.println("A Call : " + number);
    }

    @Override
    public void call() {
        action(100, 200);
    }


    public void minus(int a, int b) {
        int min = b - a;
        if ( min > 50 ) {
            call(); // sınıfımda bulunan call methodudur.
        }else {
            super.call(); // miras olarak gelen defult method
        }
        System.out.println("Min : " + min);
    }

}
