/*    using default constructor in multilevel inheritance
 * 
 * 
 * 
 * gdfghh
 * java
 * somesh
 */
import java.util.*;
class circle{
    double r;
    Scanner sc=new Scanner (System.in);
    circle(){
        System.out.println("\t\t\t\t----------CIRCLE-----------");
        System.out.print("Enter the radius=");
        r=sc.nextDouble();
        double peri=2*Math.PI*r;
        System.out.println("Perimeter of a circle="+peri);
    }
}
class Square extends circle{
    int a;
    Square(){
        System.out.println("\t\t\t\t----------SQUARE-----------");
        System.out.print("Enter the side=");
        a=sc.nextInt();
        int pe=4*a;
        System.out.println("Perimeter of a square="+pe);
    }
}
class Rectangle extends Square{
    int l,b;
    Rectangle(){
        System.out.println("\t\t\t\t----------RECTANGLE-----------");
        System.out.print("Enter the lenght=");
        l=sc.nextInt();
        System.out.print("Enter the breadth=");
        b=sc.nextInt();
        int per=2*(l+b);
        System.out.println("Perimeter of a Rectangle="+per);
    }
}

class Pratice{
    public static void main(String[] args) {
        Rectangle ob=new Rectangle();
    }
}     