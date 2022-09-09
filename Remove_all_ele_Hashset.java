package Collection_Hashset_ASS;

import java.util.HashSet;
// 12. Write a Java program to remove all of the elements from a hash set.
public class Remove_all_ele_Hashset {
    public static void main(String[] args) {
        HashSet H = new HashSet();

        H.add(2);
        H.add(4);
        H.add(6);
        H.add(8);
        H.add(10);

        System.out.println("Original Hashset contains :"+H);

        H.clear();
        System.out.println("Hashset content : "+H);
    }
}

/*
Output :

        Original Hashset contains :[2, 4, 6, 8, 10]
        Hashset content : []

 */