package _arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MainArrayList {

    public static void main(String[] args) {

        String[] stArr = {"İstanbul", "Ankara", "Adana"};
        stArr[2] = "Aydın";
        System.out.println( stArr );


        // ArrayList
        List<String> ls = new ArrayList<>();

        // add
        ls.add("İstanbul");
        ls.add("Ankara");
        ls.add("İzmir");
        ls.add("Samsun");
        ls.add("Adana");
        ls.add("Edirne");

        // add index
        ls.add(1, "Edirne");

        // remove
        ls.remove("Edirne");

        ArrayList<String> removeList = new ArrayList<>();
        removeList.add("Edirne");
        removeList.add("İstanbul");
        //ls.removeAll(removeList);

        // size
        int size = ls.size();
        int index = 10;
        if ( size > index ) {
            ls.remove(index);
        }

        // all item clear
        // ls.clear();

        // loop
        for ( String item : ls ) {
            System.out.println( item );
        }

        String name1 = "Ali";
        String name2 = "Alim";
        System.out.println( name1.hashCode() );
        System.out.println( name2.hashCode() );

        // contains
        boolean status = ls.contains("İstanbul");
        System.out.println(status);

        String itm = ls.get(0);
        System.out.println(itm);

        int indexOf = ls.indexOf("Edirne");
        System.out.println( indexOf );

        // Değer değişimi
        ls.set(0, "Gaziantep");
        ls.add(0, "İstanbul");

        Iterator<String> iterator = ls.iterator();
        while( iterator.hasNext() ) {
            String item = iterator.next();
            System.out.println("iter : " + item);
        }

        while( iterator.hasNext() ) {
            String item = iterator.next();
            System.out.println("iter x: " + item);
        }

        List<String> pageList = ls.subList(5, 7);
        System.out.println(pageList);

        // Sort
        Collections.sort(ls);
        System.out.println(ls);

        Collections.reverse(ls);
        System.out.println(ls);


        // Property Using
        List<User> users = new ArrayList<>();

        User u1 = new User();
        u1.setAge((byte)30);
        u1.setName("Ali");
        u1.setPhone("2345678");

        User u2 = new User("Erkan", "865432", (byte)40);
        User u3 = new User("Serkan", "23423", (byte)33);
        User u4 = new User("Ayşe", "1231231", (byte)22);
        User u5 = new User("Zehra", "678786", (byte)30);

        users.add(u1);
        users.add(u2);
        users.add(u3);
        users.add(u4);
        users.add(u5);

        for ( User item : users ) {
            System.out.println( item.getName() + " " + item.getPhone() );
        }

        System.out.println(users);

    }

}
