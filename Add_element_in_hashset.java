package Collection_Hashset_ASS;

import java.util.HashSet;
// 1. Write a Java program to append the specified element to the end of a hash set.
public class Add_element_in_hashset {
    public static void main(String[] args) {

        HashSet<String> ob=new HashSet<>();

        ob.add("Rohit");
        ob.add("Shridhar");
        ob.add("Swapnil");
        ob.add("Vaibhav");
        ob.add("Roshan");
        ob.add("Dhiraj");

        System.out.println(ob);


    }
}
/*
Output :

        [Roshan, Rohit, Dhiraj, Shridhar, Vaibhav, Swapnil]

 */
