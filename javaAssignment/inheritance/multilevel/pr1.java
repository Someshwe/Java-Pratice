/*import java.util.*;
public class pr1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number=");
        int a=sc.nextInt();
        int a1=a/100;
        System.out.println(a1);
        int a2=(a%100)/10;
        System.out.println(a2);
        int a3=a%10;
        System.out.println(a3);
    }
}*/
import java.util.*;
class A{
    int a;
    void First(int aa){
        a=aa;
        int a1=a/100;
        System.out.println("The first number of three digit number is=" +a1);
    }
}
class B extends A{
    int b;
    void second(int bb){
        b=bb;
        int b2=(b%100)/10;
        System.out.println("The second number of three digit number is=" +b2);
    }
}
class c extends B{
    int c;
    void third(int cc){
        c=cc;
        int c3=c%10;
        System.out.println("The third number of three digit number is=" +c3);
    }
}
public class pr1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the three digit number=");
        int num=sc.nextInt();
        c ob=new c();
        ob.First(num);
        ob.second(num);
        ob.third(num);
    }
}
