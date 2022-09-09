package Collection_Hashset_ASS;

import java.util.HashSet;
// 5. Write a Java program to test a hash set is empty or not.
public class Empty_or_not_Hashset {
    public static void main(String[] args) {
        HashSet HS=new HashSet();

        HS.add(47);
        HS.add(67);
        HS.add(412);
        HS.add(473);
        HS.add(67);
        HS.add(97);

        System.out.println("Default Hashset :"+HS);

        System.out.println("Checking the above array list is empty or not : "+HS.isEmpty());

    }
}
/*
output :

        Default Hashset :[97, 67, 473, 412, 47]
        Checking the above array list is empty or not : false

 */