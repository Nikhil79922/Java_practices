
public class Inherit {
    public static void main(String [] args){
        shape sp = new rectriangle(2,3);
        sp.area();
      System.out.println(sp.name);
    }
}

class shape{
    public String name= "Nikhil";
    public void area(){
        System.out.println(" Display Area ");
    }
}

class circle extends  shape{
    int radius;
    circle(int radius){
   this.radius=radius;
    }

    public void area(){
        System.out.println("Area of circle "+ (2 * 3.14 * this.radius * this.radius));
    }
}

class rectriangle extends  shape{
    int len;
    int brethe;

    rectriangle(int len , int brethe){
        this.len=len;
        this.brethe=brethe;
    };
//    @Override
//    public void area(){
//        System.out.println("Area of rectriangle "+ (this.len * this.brethe));
//    };

}

class square extends  shape{
    int len;
    square(int len ){
        this.len=len;
    };

    public void area(){
        System.out.println(" Area of square " + ( this.len * this.len ) );
    };

}
