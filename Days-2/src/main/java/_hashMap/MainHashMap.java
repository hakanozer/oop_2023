package _hashMap;

import _arraylist.User;

import java.util.*;

public class MainHashMap {
    public static void main(String[] args) {

        // Map - HashMap
        // key - val
        HashMap<String, Object> hmx = new HashMap<>();
        Map<String, Object> hm = new HashMap<>();

        // add data
        hm.put("uid", 100);
        hm.put("uid", 80);
        hm.put("name", "Selin");
        hm.put("surname", "Bilmem");
        hm.put("email", "ali@mail.com");

        // get item
        System.out.println( hm.get("name") );

        // remove
        // hm.remove("name");

        Set<String> keys = hm.keySet();
        for ( String key : keys ) {
            System.out.println( key + " - " + hm.get(key) );
        }

        System.out.println( hm.size() );
        System.out.println(hm);

        List<Map<EMap, Object>> list = new ArrayList<>();
        Map<EMap, Object> hm1 = new HashMap<>();
        hm1.put(EMap.name, "Ahmet");
        hm1.put(EMap.email, "ahmet@mail.com");
        hm1.put(EMap.surname, "Bil");
        hm1.put(EMap.phone, "123123123");
        list.add(hm1);

        Map<EMap, Object> hm2 = new HashMap<>();
        hm2.put(EMap.name, "Zehra");
        hm2.put(EMap.email, "zehra@mail.com");
        hm2.put(EMap.surname, "Bilisn");
        hm2.put(EMap.phone, "654321");
        list.add(hm2);

        for ( Map<EMap, Object> item : list ) {
            System.out.println( item.get(EMap.name) );
        }
        System.out.println( hm1 );

        // Linked HashMap
        User user = new User("Erkan", "1231231", (byte)40);
        Map<EMap, Object> hm3 = new LinkedHashMap<>();
        hm3.put(EMap.name, "Ahmet");
        hm3.put(EMap.email, "ahmet@mail.com");
        hm3.put(EMap.surname, "Bil");
        hm3.put(EMap.phone, "123123123");
        hm3.put(EMap.user, user);
        System.out.println( hm3 );

    }
}
