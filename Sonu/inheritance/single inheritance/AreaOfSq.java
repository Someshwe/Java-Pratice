/*    using parameterized constructor in single inheritance
 * 
 * 
 * 
 * gdfghh
 * java
 * somesh
 */
import java.util.*;
class A{
    int a;
    int Area(int ab){
        int a=ab;
        int area=a*a;
        System.out.println("Area is="+area);
        return (area);
    }
}
class B extends A{
    int a2;
    int perimeter(int aa){
        a2=aa;
        int peri=4*aa;
        System.out.println("Perimeter is="+peri);
        return (peri);
    }
}
class AreaOfSq{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        B ob=new B();
        int a1;
        System.out.print("Enter the side=");
        a1=sc.nextInt();
        ob.Area(a1);
        ob.perimeter(a1);
    }
}
