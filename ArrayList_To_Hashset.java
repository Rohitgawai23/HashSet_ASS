package Collection_Hashset_ASS;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayList_To_Hashset {
    public static void main(String[] args) {
        ArrayList ob=new ArrayList();

        ob.add(1);
        ob.add(2);
        ob.add(2);
        ob.add(2);
        ob.add(1);

        System.out.println("ArrayList Element : "+ob);

        HashSet HS = new HashSet(ob);

        System.out.println("Convert Hashcode Element : "+HS);


    }
}
 /*
Output :

        ArrayList Element : [1, 2, 2, 2, 1]
        Convert Hashcode Element : [1, 2]

  */