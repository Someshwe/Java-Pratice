import java.util.*;
interface text{
    void Surfacearea();
    void Volum();
    Scanner sc=new Scanner(System.in);
}
class Sphere implements text{
    double r,area,volum;
    public void Surfacearea(){
        System.out.print("Enter the radius=");
        r=sc.nextDouble();
        area=(double)4*Math.PI*r*r;
        System.out.println("SurfaceArea of a Sphere is="+area);
        Volum();
    }
    public void Volum(){
        volum=(double)4/3*(Math.PI*(r*r*r));
        System.out.println("Volum of a Sphere is="+volum);
    }
}
class Hemisphere implements text{
    double r,area,volum;
    public void Surfacearea(){
        System.out.print("Enter the radius=");
        r=sc.nextDouble();
        area=(double)3*Math.PI*(r*r);
        System.out.println("SurfaceArea of a HemiSphere is="+area);
        Volum();
    }
    public void Volum(){
        volum=(double)2/3*(Math.PI*(r*r*r));
        System.out.println("Volum of a Hemisphere is="+volum);
    }
}
class P2{
    public static void main(String[] args) {
        Sphere ob=new Sphere();
        ob.Surfacearea();
        Hemisphere ob1=new Hemisphere();
        ob1.Surfacearea();
    }
}
