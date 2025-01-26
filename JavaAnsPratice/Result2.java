import java.util.Scanner;

public class Result2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the m value=");
        double m=sc.nextDouble();
        System.out.print("Enter the n value=");
        double n=sc.nextDouble();
        System.out.print("Enter the o value=");
        double o=sc.nextDouble();
        System.out.print("Enter the p value=");
        double p=sc.nextDouble();
        double p1=m*n*o*p;
        double p2=o+p+n;
        double result=(p1/p2)*m;
        System.out.println("The result is="+result);
    }
}
