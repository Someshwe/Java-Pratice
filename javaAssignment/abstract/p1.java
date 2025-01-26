import java.util.*;
abstract class Areperi{
    abstract void Area();
    abstract void Peri();
    Scanner sc=new Scanner(System.in);
}
class rect extends Areperi{
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
class sqr extends Areperi{
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
class p1{
    public static void main(String[] args) {
        rect ob=new rect();
        ob.Area();
        sqr ob1=new sqr();
        ob1.Area();
    }
}