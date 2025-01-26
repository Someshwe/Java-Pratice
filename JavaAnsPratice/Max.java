import java.util.*;
public class Max{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number=");
        int num1=sc.nextInt(); 
        System.out.print("Enter the second number=");
        int num2=sc.nextInt();
        int max=0;

        switch (num1>num2 ? 1:2) {
            case 1:
                max=num1;
                break;
        
            case 2:
                max=num2;
                break;
        }
        System.out.println("Maximum number of two number is="+max);
    }
}