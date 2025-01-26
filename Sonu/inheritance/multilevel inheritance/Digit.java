/*import java.util.*;
class Digit{
    public static void main(String[] args) {
        int num=702;
        int a3=num%10;
        int a2=(num%100)/10;
        int a1=num/100;
        System.out.println(a3);
        System.out.println(a2);
        System.out.println(a1);
    }
}*/
import java.util.*;
class A{
    int a;
    A(int aa){
        a=aa;
        int a1=a/100;
        System.out.println("First Digit in three digit number="+a1);
    }
}
class B extends A{
    int b;
    B(int bb){
        super(bb);
        b=bb;
        int a2=(b%100)/10;
        System.out.println("Second Digit in three digit number="+a2);
    }
}
class C extends B{
    int c;
    C(int cc){
        super(cc);
        c=cc;
        int a3=c%10;
        System.out.println("Third Digit in three digit number="+a3);
    }
}
class Digit{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the three digit number=");
        int num=sc.nextInt();
        C ob=new C(num);
    }
}