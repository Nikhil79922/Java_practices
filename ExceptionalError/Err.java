package ExceptionalError;

import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Err {
    public static void main(String[] args) throws Exception {
        int[] neo = {100, 200, 300, 400};
        int deo[] = {1, 2, 3, 0};
        for (int i = 0; i < 10; i++) {
            try {
                int acc = divide(neo[i], deo[i]);
                System.out.println(acc);
            }catch (Exception e){
                System.out.println("Error Details ==>"+e);

            }
        }

        stu s = new stu(3, 4);
        s.getValues();
        System.out.println(s);
        System.out.println("Good Job :) ");
        try {
             method1();
            System.out.println("working file");
        } catch (Exception e) {
            System.out.println("File not found.");
            System.out.println(e);
        }
    }

    public static int divide(int a, int b) {
        try {
            stu s = null;
            s.getValues();
            System.out.println(s);
            return a / b;
        } catch (NullPointerException | ArithmeticException e) {
            System.out.println(e);
            return -1;
        } catch (RuntimeException e) {
            System.out.println(e);
            return -1;
        }catch (Exception e) {
            System.out.println(e);
            return -1;
        }

    }

    public static void method1() throws Exception{
//        FileReader file = new FileReader("a.txt");
        try {
            method2();
        }catch (Exception e){
            System.out.println(e);
            throw new insufficiant();
        }
    }

    public static void method2() throws Exception {
        try {
        FileReader file = new FileReader("a.txt");
            System.out.println("working file");
        } catch (Exception e) {
            System.out.println("File not found.");
            throw new insufficiant();
        }
    }
}

class stu {
    int a;
    int b;

    public stu(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void getValues() {
        System.out.println(this.a + this.b);
    }

    @Override
    public String toString() {
        System.out.println("Overrided class is working");
        return "String";
    }
}

class insufficiant extends Exception{
    public insufficiant(){
        super("Infucciant balance");
    }
}


