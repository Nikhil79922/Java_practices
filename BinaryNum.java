public class BinaryNum {
    public static void main(String[] args){
        new String("Hell0");

        //Bitwise operators  in Binary
        // 1) AND (&):- only both true returns true.
        /* 2) OR (|):- true when any one has true.
        *  3) XOR (^):- true when both are true or both are false.
        *  4) binary one's compliment (~):- Convert true into false and false into true
        *  5) binary left shift :- N<<i :- 2<<1 :- it shift the binary towards the left with the given i and add the "0".
        *  6) binary right shift :- N>>i :- 2>>1 :- it shift the binary towards the right with the given i and add the "0".
        * */

        //Get the 3rd bit(position 2nd) of a number n. n=0101;
         int n = 5;
         int pos = 3;
         int bitMask = 1<<pos;
         if((bitMask & n)==0){
             System.out.println("Bit was zero");
         }else{
             System.out.println("Bit was one");
         }

        //Set the 1st bit(position 2nd) of a number n. n=0101;
        int m = 5;
        int pos1 = 1;
        int bitMask1 = 1<<pos;
        if((bitMask1 | n)==0){
            System.out.println("Bit was zero");
        }else{
            System.out.println("Bit was one");
        }

        //Clear the 3st bit(position 2nd) of a number n. n=0101; use AND with Not.
        int o = 5;
        int pos2 = 2;
        int bitMask2 = 1<<pos2;
        int NotBitMask2 = ~(bitMask2);
        int clearpos= NotBitMask2 & o;
        System.out.println(clearpos);
    }
}
