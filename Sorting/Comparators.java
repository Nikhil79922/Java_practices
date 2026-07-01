package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Comparators {
    public static void main(String[] args) {
        List<Integer> list =  new ArrayList<>();
        list.add(1);
        list.add(7);
        list.add(2);
        list.add(4);

        list.sort(new MyComparator());
        System.out.println(list);

        List<String> word =  Arrays.asList("banana","apple","mango");
        word.sort(new MyComparator2());
        System.out.println(word);

        List<student> stu = Arrays.asList(new student("OG Singh" , 13 , 600) ,new student("Nikhil" , 21 , 590) ,new student("Rohan" , 13 , 540) ,new student("Arjun" , 10 , 500) );
        stu.sort(null);
        System.out.println(stu);
    }
}

class MyComparator2 implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }
}

class MyComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
       return o2-o1;
    }
}


class student implements Comparable<student>{
String name ;
int roll ;
int totalMark;

student(String name , int roll , int totalMark){
    this.name = name;
    this.roll = roll;
    this.totalMark = totalMark;
}
    @Override
    public int compareTo( student o1) {
//       return o1.totalMark - this.totalMark;
        return Double.compare(o1.totalMark , this.totalMark);
    }

    @Override
    public String toString() {
        return name + " Roll:" + roll + " Marks:" + totalMark;
    }
}
