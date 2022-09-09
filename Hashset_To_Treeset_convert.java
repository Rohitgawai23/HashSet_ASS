package Collection_Hashset_ASS;

import java.util.HashSet;
import java.util.TreeSet;
// 8. Write a Java program to convert a hash set to a tree set.
public class Hashset_To_Treeset_convert {
    public static <Hashset> void main(String[] args) {

        HashSet<String> ob=new HashSet<>();

        ob.add("Rohit");
        ob.add("Shridhar");
        ob.add("Swapnil");
        ob.add("Vaibhav");
        ob.add("Roshan");
        ob.add("Dhiraj");

        System.out.println("Hashset element : "+ob);

        TreeSet<String> Tree_set= new TreeSet<>(ob);

        System.out.println("Display Tree set element :");
        for(String element: Tree_set)
        {
            System.out.println(element);
        }
    }
}
/*
Output :

        Hashset element : [Roshan, Rohit, Dhiraj, Shridhar, Vaibhav, Swapnil]
        Display Tree set element :
        Dhiraj
        Rohit
        Roshan
        Shridhar
        Swapnil
        Vaibhav

 */