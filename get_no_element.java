package Collection_Hashset_ASS;

import java.util.HashSet;

// Write a Java program to get the number of elements in a hash set.
public class get_no_element {
    public static void main(String[] args) {
        HashSet ob=new HashSet();

        ob.add(3);
        ob.add(4);
        ob.add(6);
        ob.add(8);
        ob.add(10);

        System.out.println("Hashset element :"+ob);

        System.out.println("Size of Hashset :"+ob.size());
    }
}
/*
Output :

        Hashset element :[3, 4, 6, 8, 10]
        Size of Hashset :5

 */