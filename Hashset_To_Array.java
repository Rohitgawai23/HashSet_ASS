package Collection_Hashset_ASS;

import java.util.HashSet;
// 7. Write a Java program to convert a hash set to an array.
public class Hashset_To_Array {
    public static void main(String[] args) {

        HashSet ob=new HashSet();

        ob.add(23);
        ob.add(45);
        ob.add(12);
        ob.add(67);
        ob.add(23);

        System.out.println("Hashset : "+ob);

        ob.toArray();
        System.out.println("Convert into Array : "+ob);
    }
}
/*
Output :

        Hashset : [67, 23, 12, 45]
        Convert into Array  : [67, 23, 12, 45]

 */