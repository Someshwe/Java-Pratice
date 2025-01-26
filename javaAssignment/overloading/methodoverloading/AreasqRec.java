import java.util.*;
class Area{
    void area(int a){
        int area=a*a;
        System.out.println("Area of a Square is="+area);
    }
    void area(int b,int c ){
        int area=b*c;
        System.out.println("Area of rectangle is="+area);
    }
}
class Peri{
    void peri(int a){
        int peri=4*a;
        System.out.println("Perimetere of a Square is="+peri);
    }
    void peri(int b,int c){
        int per=2*(b+c);
        System.out.println("Perimeter of rectangle is="+per);
    }
}
class AreasqRec{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the side of Square=");
        int a1=sc.nextInt();
        Area ob=new Area();
        Peri ob1=new Peri();
        ob.area(a1);
        ob1.peri(a1);
        System.out.print("enter the length of rectangle= ");
        int b1=sc.nextInt();
        System.out.print("enter the bradth of rectangle= ");
        int c1=sc.nextInt();
        ob.area(b1, c1);
        ob1.peri(b1, c1);
    }
}