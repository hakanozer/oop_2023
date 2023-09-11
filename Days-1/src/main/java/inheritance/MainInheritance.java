package inheritance;

public class MainInheritance {

    public static void main(String[] args) {

        Base ba = new A();
        Base bb = new B();
        Base bc = new C();

        actionCall(ba);
        actionCall(bb);
        actionCall(bc);

        User user = new User();
        user.setUid(100);
        user.setName("Serkan Bilirim");
        user.setEmail("serkan@mail.com");
        System.out.println( user );

    }

    public static void actionCall( Base base ) {
        if ( base instanceof A ) {
            A a = (A) base;
            a.minus(30, 5);
        }
        base.call();
    }


}
