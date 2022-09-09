package Collection_Hashset_ASS;

import java.util.HashSet;

public class Hashset_not_allow_duplicate_ele {
    public static void main(String[] args) {

        HashSet H=new HashSet();

        H.add(1);
        H.add(99);
        H.add(2);
        H.add(99);
        H.add(99);

        System.out.println(H);


    }
}

/*
Output :

        [1, 2, 99]

 */