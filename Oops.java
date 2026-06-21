class Pen{
    String  name;
    String type;

    public void write(){
        System.out.println("Print the write value for the Pen class");
    }

    public void writenBy(){
        System.out.println("Print the write value for the Pen class with the writer name" + this.name);
    }
}

class Student {
    String name;
    int roll;
    static String school="ST xavier's";

//    Student(String name , int roll){     // Parameterzied constructor.
//        this.name = name;
//        this.roll = roll;
//    }

        Student(Student s1){     // Copy constructor.
        this.name = s1.name;
        this.roll = s1.roll;
    }


        Student() { // Non Parameterzied constructor. Note:-  needed when copy contrustor is defined.
            System.out.println("Default Constructor");
        }

        Student(String name) {
            this.name = name;
        }

        Student(String name, int roll) {
            this.name = name;
            this.roll = roll;
        }

    public void studentInfo(){
        System.out.println("Name of the student "+this.name);
        System.out.println("Roll of the student "+this.roll);

    }



}

public class Oops {
    public static void main(String [] args){
        Pen p1 = new Pen();
        p1.name="Nikhil";
        p1.type="gel";
        p1.writenBy();

        Pen p2 = new Pen();
        p2.name="King";
        p2.type="ball";
        p2.writenBy();

        System.out.println(Student.school);
//        Student s1= new Student(p1.name , 21);
        Student s1 = new Student();
        s1.roll=26;
        s1.name = p2.name;

        Student s2=new Student(s1);
        s1.studentInfo();

        Student s3=new Student("OG boi");
        s3.studentInfo();

        Student s4=new Student("Deep" , 39);
        s4.studentInfo();

    }
}


