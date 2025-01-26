import java.util.*;
public class Evodd{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number=");
        int num1=sc.nextInt(); 
        switch (num1%2==0 ? 1:2) {
            case 1:
                System.out.println("number is even");
                break;
        
            case 2:
                System.out.println("number is odd");
                break;
        }
    }
}