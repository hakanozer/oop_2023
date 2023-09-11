package oop;

import java.util.Random;

public class Action {

    public int number = 100;
    Random random = new Random();
    Profile profile = new Profile();


    // Methods
    // No params no Return method
    public void noParams() {
        String surname = "Bilmem";
        System.out.println(surname);
    }

    public void security( String username ) {
        if ( username.equals("ali@mail.com") ) {
            System.out.println("Success");
        }else {
            System.out.println("Fail");
        }
    }


    public boolean login( String email, String password ) {
        if ( email.equals("ali@mail.com") && password.equals("12345") ) {
            return true;
        }
        return false;
    }

    public void addLines(String... lines) {
        for ( String item : lines ) {
            System.out.println(item);
        }
    }


}
