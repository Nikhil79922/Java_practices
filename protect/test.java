package protect;

public class test {
    int a;
    int b;

    public test(int a , int b){
        a=this.a;
        b=this.b;
    }

    protected boolean sum(){
        return this.a > this.b ? true : false;
    }

}
