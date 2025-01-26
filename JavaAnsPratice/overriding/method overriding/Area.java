/*
 * 
 * method overriding is only use in inheritance.
 */
import java.util.Scanner;

class rsct{
    Scanner sc=new Scanner(System.in);
    void area(){
        System.out.print("Enter the lenght of rectangle=");
        int l=sc.nextInt();
        System.out.print("Enter the breadth of rectangle=");
        int b=sc.nextInt();
        int Area=l*b;
        System.out.println("Area of a rectangle is="+Area);
    }
}
class B extends rsct{
    void area(){
        super.area();
        System.out.print("Enter the side of square=");
        int a=sc.nextInt();
        int area=a*a;
        System.out.println("Area of a square is="+area);
    }
}
class Area{
    public static void main(String[] args) {
        B ob=new B();
        ob.area();
    }
}