import java.util.*;
class Area{
    double base;
    double height;
    Double AREA;
    Scanner sc=new Scanner(System.in);
    Area(){
        System.out.print("Enetr the base of Rectangle=");
        base=sc.nextDouble();
        System.out.print("Enetr the height of Rectangle=");         //using default constructor
        height=sc.nextDouble();
        AREA=(double)base*height;
        System.out.println("Area of a Rectangle="+AREA);
    }
}
class peri{
    double bas;
    double height;
    peri(double le, double he){               //using paframeter rize constructor
        bas=le;
        height=he;
        double pr=(double)2*(bas+height);
        System.out.println("peri of a Rectangle="+pr);
    }
}
public class Class {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Area ob=new Area();
        System.out.print("Enetr the base of Rectangle=");
        double bs=sc.nextDouble();
        System.out.print("Enetr the height of Rectangle=");         //using constructor
        double hie=sc.nextDouble();
        peri obj=new peri(bs,hie);
    }
}
