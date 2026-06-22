public class Abstraction{

    public static void main(String[] args){
        p1 ab = new p1();
        System.out.println(ab.needed(2,3));
    }
}

abstract class Abstract {
    Abstract(){
        System.out.println("Abstract call construction worked");
    }

    public void check(){
        System.out.println("Method as also be used");
    }

    abstract int needed(int a , int b); // Now all the inherited subclasses must have this method declaration;
}

class p1 extends Abstract{
    p1(){
        super();
        System.out.println("Abstract class constructor invoked");
    }
    public int needed(int a , int b) {
        return a + b;
    }
}

