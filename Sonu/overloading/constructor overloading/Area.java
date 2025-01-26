import java.util.Scanner;

class rsct{
    int l,b,a;
    double r,ba,h;
    rsct(int a1,int a2){
        l=a1;
        b=a2;
        int Area=l*b;
        System.out.println("Area of a rectangle is="+Area);
    }
    rsct(int a3){
        a=a3;
        int area=a*a;
        System.out.println("Area of a square is="+area);
    }
    rsct(double r1){
        r=r1;
        double area=(double)Math.PI*r*r;
        System.out.println("Area of a circle is="+area);
    }
    rsct(double ba1,double h1){
        ba=ba1;
        h=h1;
        double area=(double)0.5*ba*h;
        System.out.println("Area of a triangle is="+area);
    }
}
class Area{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the lenght of rectangle=");
        int a11=sc.nextInt();
        System.out.print("Enter the breadth of rectangle=");
        int a12=sc.nextInt();
        System.out.print("Enter the side of square=");
        int a13=sc.nextInt();
        System.out.print("Enter the radius of a circle=");
        double a14=sc.nextDouble();
        System.out.print("Enter the base of triangle=");
        double b11=sc.nextDouble();
        System.out.print("Enter the heighrt of triangle=");
        double b12=sc.nextDouble();
        rsct ob=new rsct(a11,a12);
        rsct ob1=new rsct(a13);
        rsct ob2=new rsct(a14);  
        rsct ob3=new rsct(b11,b12);
        
    }
}