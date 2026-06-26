package collections;

import java.util.Stack;

public class StackCollection {

    public static void main(String [] args){
        Stack<Integer> list = new Stack<>();
        list.push(5);
        list.push(6);
        list.push(7);
        list.push(8);
        list.push(9);
list.add(5);
        System.out.println(list.peek());

        for(int item : list){
            System.out.println(item);
        }
    }


}
