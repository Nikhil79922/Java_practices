//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gut
import protect.test;

public class Main extends test{
    public Main(int a , int b){
        super(a , b);
    }

    public static void main(String[] args) {
        Main obj =new Main(2,4);
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text

        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome! "+args[2]);
        obj.sum();
        for (int i = 1; i <= 5; i++) {//TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            System.out.println(sum(i,i+1));
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }



    public static int sum(int a , int b){
        return a+b;
    }
    class animnal{


    }







}