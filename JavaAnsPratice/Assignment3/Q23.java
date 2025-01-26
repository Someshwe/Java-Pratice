import java.util.*;
public class Q21{
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter the a angle="); 
       int a=sc.nextInt();
       System.out.print("Enter the b angle="); 
       int b=sc.nextInt();
       System.out.print("Enter the c angle="); 
       int c=sc.nextInt();
       if(a+b+c==180 && a>0 && b>=0 && c>=0){
        System.out.println("Triangle is valid");
       }
       else{
        System.out.println("Triangle is invalid");
       }
    }
}