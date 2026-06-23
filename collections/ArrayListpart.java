package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListpart {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();

        //Add elements
        list.add(5);
        list.add(2);
        list.add(4);
        list.add(1);
        System.out.println(list);

        // add element in middle;
        list.add(2,3);
        System.out.println(list);

        //get element from ArrayList
        int element = list.get(3);
        System.out.println(element);

        //Set/Update element in Array
        list.set(0,0);
        System.out.println(list);

        //remove element in Array
        list.remove(0);
        System.out.println(list);

        //list size;
        int len= list.size();
        for (int i = 0; i < len; i++) {
            System.out.print(list.get(i));
        }
        System.out.println();

        //List sorting
        Collections.sort(list);
        System.out.println(list);
    }
}
