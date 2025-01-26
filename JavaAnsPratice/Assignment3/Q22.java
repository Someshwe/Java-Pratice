import java.util.*;
public class Q22{
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter the a side="); 
       int a=sc.nextInt();
       System.out.print("Enter the b side="); 
       int b=sc.nextInt();
       System.out.print("Enter the c side="); 
       int c=sc.nextInt();
       if(a+b>c && a+c>b && b+c>a){
        System.out.println("Triangle is valid");
       }
       else{
        System.out.println("Triangle is invalid");
       }
    }
}