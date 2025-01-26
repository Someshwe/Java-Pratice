import java.util.*;
class A{
    double b,h;
    void tri(double a1, double b1){
        b=a1;
        h=b1;
        double area=(double)0.5*b*h;
        System.out.println("The area of Triangle is="+area);
    }
}
class B extends A{
    double l,b;
    B(double aa,double bb){
        l=aa;
        b=bb;
        double areas=l*b;
        System.out.println("Area of a Rectangle= "+areas);
    }
}
class c extends A{
    double l1,b1;
    c(double ll,double bb){
        l1=ll;
        b1=bb;
        double peri=2*(l1+b1);
        System.out.println("perimeter of a rectangle="+peri);
    }
}
public class prt1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("\t\t\t\t\t------------TRIANGLE-------------");
        System.out.print("Enter the base of Triangle=");
        double num1=sc.nextDouble();
        System.out.print("Enter the Height of Triangle=");
        double num2=sc.nextDouble();
        A obbj=new A();
        obbj.tri(num1, num2);
        System.out.println("\t\t\t\t\t------------RECTANGLE-------------");
        System.out.print("Enter the Lenght of Rectangle=");
        double num3=sc.nextDouble();
        System.out.print("Enter the bradth of Rectangle=");
        double num4=sc.nextDouble();
        B ob=new B(num3,num4);
        c obj=new c(num3,num4);
    }
}