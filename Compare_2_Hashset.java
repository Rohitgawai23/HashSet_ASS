package Collection_Hashset_ASS;

import java.util.HashSet;

// 10. Write a Java program to compare two hash set.
public class Compare_2_Hashset {
    public static void main(String[] args) {

        HashSet<String> HS = new HashSet<>();

        HS.add("Rohit");
        HS.add("Atul");
        HS.add("Abbas");
        HS.add("Akash");
        HS.add("Hement");

        System.out.println("1st Hashset : "+HS);

        HashSet<String> HS1 = new HashSet<>();

        HS1.add("Gaurav");
        HS1.add("Anil");
        HS1.add("Dhiraj");
        HS1.add("Shridhar");
        HS1.add("Ankush");

        System.out.println("2nd Hashset : "+HS1);
        System.out.println("========================================================");

        if(HS.equals(HS1))
        {
            System.out.println("Hashset 1 and Hashset 2 are equal :");
        }
        else
            System.out.println("Hashset 1 and Hashset 2 are NOT equal");
    }
}

/*
output :

        1st Hashset : [Rohit, Abbas, Hement, Atul, Akash]
        2nd Hashset : [Dhiraj, Ankush, Gaurav, Shridhar, Anil]
        ========================================================
        Hashset 1 and Hashset 2 are NOT equal

 */