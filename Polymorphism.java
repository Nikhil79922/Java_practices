
public class Polymorphism {
    public static void main(String [] args){
        Students s = new Students();
        System.out.println("Hello Poly");
        s.stu("King Slayer");
        s.stu(22);
        s.stu("Jemmi" , 69);
    }
}

class Students{
 String name = "Nikhil";
 int n = name.length();

 Students(){
 }

    public void stu(String names){
     System.out.println(names);
 }
    public void stu(int roll){
     System.out.println(roll);
 }
    public void stu(String names,int roll){
     System.out.println(names + " roll number is : "+ roll );
 }

}

