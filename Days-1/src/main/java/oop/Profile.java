package oop;

public class Profile {

    // Kurucu Methodlar
    // Sınıf ismi ile aynı isme sahip olmalıdır.
    // Biz yazmadığımızda defult halde bir tane vardır.
    int number = 10;
    String name = "";

    public Profile() {
        System.out.println("Profile Call :" + number);
    }

    public Profile( int number ) {
        this.number = number;
    }

    public Profile( int number, String name ) {
        this.number = number;
        this.name = name;
    }

    public void call() {
        System.out.println("Call : " + number);
    }

}
