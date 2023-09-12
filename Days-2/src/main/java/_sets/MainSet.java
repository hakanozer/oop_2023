package _sets;

import java.util.*;

public class MainSet {
    public static void main(String[] args) {


        List<String> ls = new ArrayList<>();
        ls.add("Java");
        ls.add("Java");
        ls.add("Java");
        ls.add(".Net");
        ls.add("Php");
        ls.add("Php");
        ls.add("React");
        ls.add("Phyton");
        System.out.println( ls );

        // SET -> Benzersiz değerlerin bir arada tutulması için kullanılır.
        // Sıralama algoritması önemli değildir.
        Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("Java");
        set.add("Java");
        set.add(".Net");
        set.add("Php");
        set.add("Php");
        set.add("React");
        set.add("Phyton");
        System.out.println( set );

        // Sıralamanın önemli olduğu LinkedSet davranışı
        Set<String> linkedSet = new LinkedHashSet<>();
        linkedSet.add("Java");
        linkedSet.add("Java");
        linkedSet.add("Java");
        linkedSet.add(".Net");
        linkedSet.add("Php");
        linkedSet.add("Php");
        linkedSet.add("React");
        linkedSet.add("Phyton");
        System.out.println( linkedSet );

    }
}
