import java.util.*;
class A{
    int a;
    int Area(int av){
        a=av;
        int area=a*a;
        System.out.println("Area of a Square is="+area);
        return (area);
    }
}
class B extends A{
    int am;
    int perimeter(int aa){
        super.Area(aa);                         //We also call this in main method dirctly and this way give the method name and this method 
        am=aa;
        int peri=4*am;
        System.out.println("Perimeter of a Square is="+peri);
        return (peri);
    }
}
class p1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        B ob=new B();
        System.out.print("Enter the side of a Square=");
        int a1=sc.nextInt();
        ob.perimeter(a1);
                                        //ob.Area(a1);
    }
}