import oop.Action;
import oop.Profile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        String name = "Ali";
        System.out.println(name);

        // new keyword
        // Sınıf içindeki yeteneklerin kullanılması için yazılmalıdır.
        Action action = new Action();

        // sınıf içinde bulunan özelliklerin listelenmesi için "." operaötür kullanılır.
        System.out.println(action.number);
        action.noParams();
        action.security("ali@mail.com");

        boolean status = action.login("erkan@mail.com", "12345");
        System.out.println("Status: " + status);

        action.addLines("İstanbul", "Ankara", "Adana");

        // Kurucu Methodlar
        Profile profile = new Profile(100);
        profile.call();
        Profile profile1 = new Profile(200, "Erkan");
        profile1.call();

        ArrayList<String> ls1 = new ArrayList<>();
        List<String> ls = new ArrayList<>();

    }
}
