package Collection_Hashset_ASS;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
// 9. Write a Java program to convert a hash set to a List/ArrayList.
public class Hashset_To_ArrayList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        HashSet<String> HS = new HashSet<>();

        System.out.println("Enter Hashset :");
        for(int i=0; i<5; i++)
        {
            String s=sc.nextLine();
            HS.add(s);

        }
        System.out.println("Original Hashset : "+HS);

        // covert into arraylist
        ArrayList<String> ob=new ArrayList<String>(HS);

        System.out.println("Convert into ArrayList : "+ob);

    }
}
/*
Output :

        Enter Hashset :
        Rohit
        Roshan
        Dhiraj
        Shridhar
        Ajay
        Original Hashset : [Roshan, Rohit, Dhiraj, Shridhar, Ajay]
        Convert into ArrayList : [Roshan, Rohit, Dhiraj, Shridhar, Ajay]

 */
