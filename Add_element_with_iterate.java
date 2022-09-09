package Collection_Hashset_ASS;

import java.util.HashSet;
import java.util.Iterator;
// 2. Write a Java program to iterate through all elements in a hash list.
public class Add_element_with_iterate {
    public static void main(String[] args) {
        HashSet<String> ob=new HashSet<>();

        ob.add("Rohit");
        ob.add("Shridhar");
        ob.add("Swapnil");
        ob.add("Vaibhav");
        ob.add("Roshan");
        ob.add("Dhiraj");

        System.out.println("Hashset element : "+ob);

        Iterator<String> I=ob.iterator();

        System.out.println("using iterator :");
        while(I.hasNext())
        {
            System.out.println(I.next());
        }
    }
}

/*
Output :

        Hashset element : [Roshan, Rohit, Dhiraj, Shridhar, Vaibhav, Swapnil]
        using iterator :
        Roshan
        Rohit
        Dhiraj
        Shridhar
        Vaibhav
        Swapnil

 */