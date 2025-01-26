import java.util.*;
class rectangle{
    Scanner sc=new Scanner(System.in);
    void value(){
        int l,b;
        System.out.print("Enter the legnth=");
        l=sc.nextInt();
        System.out.print("Enter the bridth=");
        b=sc.nextInt();
        int area=l*b;
        System.out.println("Area of a rectangle="+area);
    }
}

public class area {
    public static void main(String[] args) {
        rectangle ob=new rectangle();
        ob.value();
    }
}
