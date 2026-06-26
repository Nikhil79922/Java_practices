import java.util.*;

public class LinkList {
public static void main(String [] args){
    LinkedList<String> list = new LinkedList<String>();
    list.addFirst("hello");
    list.add("Nikhil");
    list.add("Singh");
    list.addLast(", from Surat");
    System.out.println(list.size());
    System.out.println(list);
}
}
