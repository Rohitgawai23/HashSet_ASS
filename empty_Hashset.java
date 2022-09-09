package Collection_Hashset_ASS;

import java.util.HashSet;
// 4. Write a Java program to empty an hash set.
public class empty_Hashset {
    public static void main(String[] args) {
        HashSet ob=new HashSet();

        ob.add(12);
        ob.add(34);
        ob.add(677);
        ob.add(18);
        ob.add(190);
        ob.add(16);

        System.out.println("Hashset element :"+ob);
        ob.removeAll(ob);
        System.out.println("Removing all the element :"+ob);
    }
}
/*
Output :

        Hashset element :[16, 34, 18, 677, 12, 190]
        Removing all the element :[]


 */