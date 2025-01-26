import java.util.*;
public class Result {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the x value=");
        double x=sc.nextDouble();
        System.out.print("Enter the y value=");
        double y=sc.nextDouble();
        System.out.print("Enter the z value=");
        double z=sc.nextDouble();
        int m=3;
        double p1=x*y;
        double p2=x+y;
        double p3=x*y*z;
        double result=(p1+p2/p3)/m;
        System.out.println("The result is="+result);
    }
}
