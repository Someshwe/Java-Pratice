/*
 * 
 * inter face is a puerly abstract class where only abstract method can be called and doesn't support non abstract method 
 */
/**
 * p1
 */
import java.util.*;
interface prc {
    void Area();
    Scanner sc=new Scanner(System.in);
}
interface pc2 extends prc{
    void peri();
}
class sqr implements prc{
    int side;
    public void Area(){
        System.out.print("enter the side of square= ");
        side=sc.nextInt();
        int area=side*side;
        System.out.println("Area of square is="+area);
        Peri();
    }
    public void Peri(){
        int perimeter=4*side;
        System.out.println("Perimeter of square is="+perimeter);
    }
}
class rect implements prc{
    int length,bradth;
    public void Area(){
        System.out.print("enter the length of rectangle= ");
        length=sc.nextInt();
        System.out.print("enter the bradth of rectangle= ");
        bradth=sc.nextInt();
        int area=length*bradth;
        System.out.println("Area of rectangle is="+area);
        Peri();
    }
    public void Peri(){
        int perimeter=2*(length+bradth);
        System.out.println("Perimeter of Rectangle is="+perimeter);
    }
}
class p2{
    public static void main(String[] args) {
        sqr ob=new sqr();
        ob.Area();
        rect ob1=new rect();
        ob1.Area();
    }
}
