import java.util.*;
interface text{
    void Surfacearea();
    void Volum();
    Scanner sc=new Scanner(System.in);
}
class Sphere implements text{
    int l,b,area,peri;
    public void Surfacearea(){
        System.out.print("Enter the length=");
        l=sc.nextInt();
        System.out.print("Enter the bradth=");
        b=sc.nextInt();
        area=l*b;
        System.out.println("Area of a rectangle is="+area);
    }
    public void Volum(){
        peri=2*(l+b);
        System.out.println("Perimeter of a rectangle is="+peri);
    }
}
class P1{
    public static void main(String[] args) {
        Sphere ob=new Sphere();
        ob.Surfacearea();
        ob.Volum();
    }
}