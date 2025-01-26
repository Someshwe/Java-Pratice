import java.util.*;
class A{
    Scanner sc=new Scanner(System.in);
    A(){
        System.out.print("Enter the number=");
        int num=sc.nextInt();
        int fact=1;
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of a number="+fact);
    }
}
class B extends A{
    B(){
        System.out.print("Enter the number=");
        int num=sc.nextInt();
        int c=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                System.out.println(i);
                c++;
            }
        }
        System.out.println("Fact of a number is="+c);  
    }
}
public class pr2 {
    public static void main(String[] args) {
        B ob=new B();
    }
    
}
