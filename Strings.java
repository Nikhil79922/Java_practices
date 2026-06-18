public class Strings {

    public static int calc(int a){
        return 20;
    }

    public static void stringBuild(){
        StringBuilder sb = new StringBuilder("Nikhil");

        sb.insert(0,"OG ");
        System.out.println(sb);

        sb.setCharAt(7,'Z');
        System.out.println(sb);


        sb.delete(0,2);
        System.out.println(sb);


        sb.append("Hello");
        sb.append(" n");
        sb.append(" Yo");
        System.out.println(sb);
    }



    public  static  void main(String[] args){
        String name= "Nikhil";
        String description = "Software developer in Narola";
        String description2 = "Software developer in Narola";

        // s1 > s2  = +ve;
        // s1 == s2 = 0;
        // s1 < s2 = -ve;
        if(description.compareTo(description2) == 0){
           System.out.println("Strings are equal");
           description2 = "Hello";
            String s = "Hello";

            s.concat(" World");

            System.out.println(s);
            System.out.println("description2==>" + description2);
        }else{
            System.out.println("Strings are Not equal");
        }

        if(new String("Nikhil") == new String("Nikhil") ){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are Not equal");
        }

//        for(int i = 0 ; i< description2.length() ; i++){
//            System.out.println(description2.charAt(i));
//        }

        stringBuild();
    }
}
