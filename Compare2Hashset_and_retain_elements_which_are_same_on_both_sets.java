package Collection_Hashset_ASS;

import java.util.HashSet;
// 11. Write a Java program to compare two sets and retain elements which are same on both sets.
public class Compare2Hashset_and_retain_elements_which_are_same_on_both_sets {
    public static void main(String[] args) {

        HashSet<String> HS1 = new HashSet<String>();

        HS1.add("Red");
        HS1.add("Green");
        HS1.add("Black");
        HS1.add("White");
        System.out.println("Frist HashSet content: "+HS1);

        HashSet<String> HS2 = new HashSet<String>();
        HS2.add("Red");
        HS2.add("Pink");
        HS2.add("Black");
        HS2.add("Orange");
        System.out.println("Second HashSet content: "+HS2);

        HS1.retainAll(HS2);
        System.out.println("HashSet content:");
        System.out.println(HS1);

    }
}

/*
Output :

        Frist HashSet content: [Red, White, Black, Green]
        Second HashSet content: [Red, Pink, Black, Orange]
        HashSet content:
        [Red, Black]

 */