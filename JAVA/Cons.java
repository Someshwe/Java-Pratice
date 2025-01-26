import java.util.*;
class area{
    area(int a,int b){
        int area=a*b;
        System.out.println("area of rectangle is="+area);
    }
}
class peri{
    peri(int a1,int b1){
        int peri=2*(a1+b1);
        System.out.println("perimeter of rectangle="+peri);
    }
}
public class Cons {
    public static void main(String[] gh){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of rectangle=");
        int l=sc.nextInt();
        System.out.print("Enter the bridth of rectangle=");
        int b=sc.nextInt();
        area ob1=new area(l,b);
        peri ob2=new peri(l,b);
    }
}
