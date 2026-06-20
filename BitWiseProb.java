import java.util.Scanner;

public class BitWiseProb {

    public static void main(String [] args){
        //1. Odd or Even
        //Using only bitwise operators, determine whether a number is odd or even.
Scanner sc = new Scanner(System.in);

//for(int i = 1; i<=10 ; i++){
//    System.out.printf("Check the Number is even or odd Attempt %d ==> ",i );
//    int a=  sc.nextInt();
//    if((a & 1)==0){
//        System.out.printf(a + " It's an even number \n");
//    }else{
//        System.out.printf(a + " It's an odd number \n");
//    }
//}



//2. Swap Two Numbers
//Swap a and b without using a temporary variable.
    int a = 5;
int b= 10;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);


        // 3) Since you're learning bit manipulation, try this next:
        //
        //Swap the 1st and 3rd bits of a number using bitwise operators only.
        //
        //Example:
        //
        //n = 10
        //binary = 1010
        //
        //Swap bit 0 and bit 2
        //
        //Result = ?
        //
        //Try solving it yourself first.

        int m = 10;
        int bitMask2=1<<2;

        int result = m ^ 1;
        result = m ^ bitMask2;
//        System.out.printf("Swapped position 1st and 3rd of 10===> %d " , result );


//        3. Count Set Bits
//        Given an integer n, count how many 1s are present in its binary representation.
//
//                Example:
//
//        n = 13 (1101)
//        Answer = 3

        int count=0;
        int o = 13;
        while(o>0){
           o = o & (o-1);
           count++;
        }
        System.out.println("count ===>"+count);


        //Clear the ith index
        int x=13;
        int pos=2;
        int bitMaskX=~(x<<pos) ;
        int res = x & bitMaskX;
        System.out.println(res);

        // remove the last set bit from the rightMost;
        int y= 12;
        int bitMaskY= y-1;
        int nik = y & bitMaskY;
        System.out.println(nik);


        int[] input = {0, 1, 2, 4};
        for (int i = 1; i < input.length; i++) {
            if ((input[i]-1 ^ (input[i - 1])) != 0) {
                System.out.println("This number is missing. ===> " + (input[i]-1));
                break;
            }
        }
//        System.out.println("XOR===>"+(4^4));

        int start = 10;
        int goal = 7;

        int bitMaskGoal = start ^ goal;
        int count1 = 0;

        while (bitMaskGoal > 0){
            bitMaskGoal = bitMaskGoal & (bitMaskGoal-1);
            count1++;
        }

        System.out.println("total bit changes : "+count1);

    }



}
