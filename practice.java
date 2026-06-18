import java.util.*;

public class practice{

    public static int calAvg(int a , int b , int c){
        return (a +b+c)/3;
    }

    public static int oddNumberSum(int n){
        int sum = 0;
        for(int i =0 ; i<n ; i++){
            sum += i%2==0? 0 : i;
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int a = sc.nextInt();
//        System.out.println("Enter the second number : ");
//        int b = sc.nextInt();
//        System.out.println("Enter the third number : ");
//        int c = sc.nextInt();
//        System.out.println("Total avg " + calAvg(a,b,c));

        System.out.println("Total odd number sum " + oddNumberSum(a));


    }




}
