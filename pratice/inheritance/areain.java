import java.util.*;
class A{
    void value(int a,int b){
        int area=a*b;
        System.out.println("Area of a Rectangle is="+area);
    }
}
class B extends A{
    void cal(double aa,double bb){
        double area=0.5*(aa*bb);
        System.out.println("Area of a triangle is="+area);
    }
}
public class areain{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("\t\t\t\t\t\t\tRectangle");
        System.out.println("Enter the l=");
        int l=sc.nextInt();
        System.out.println("Enter the b=");
        int b=sc.nextInt();
        System.out.println("\t\t\t\t\t\t\tTriangle");
        System.out.println("Enter the ba=");
        Double ba=sc.nextDouble();
        System.out.println("Enter the h=");
        Double h=sc.nextDouble();
        B ob=new B();
        ob.cal(ba,h);
        ob.value(l, b);
        
    }
}