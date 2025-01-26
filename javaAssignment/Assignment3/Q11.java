import java.util.*;
public class Q11{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Eneter first number mark=");
        int num1=sc.nextInt();
        System.out.print("Eneter second number mark=");
        int num2=sc.nextInt();
        System.out.print("Eneter third number mark=");
        int num3=sc.nextInt();
        System.out.print("Eneter fourth number mark=");
        int num4=sc.nextInt();
        System.out.print("Eneter fifth number mark=");
        int num5=sc.nextInt();
        if(num1<=num2 && num1<=num3 && num1<=num4 && num1<=num5){
            System.out.println("First number is small than other number");
        }
        else if(num2<=num1 && num2<=num3 && num2<=num4 && num2<=num5){
            System.out.println("second number is small than other number");
        }
        else if(num3<=num1 && num3<=num2 && num3<=num4 && num3<=num5){
            System.out.println("third number is small than other number");
        }
        else if(num4<=num1 && num4<=num2 && num4<=num3 && num4<=num5){
            System.out.println("fourth number is small than other number");
        }
        else{
            System.out.println("fifth number is small than other number");
        }
    }
}