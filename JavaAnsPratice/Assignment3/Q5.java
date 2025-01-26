import java.util.*;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the 1st number=");
        int num1=sc.nextInt();
        System.out.print("Enter the 2nd number=");
        int num2=sc.nextInt();
        if (num1>num2) {
            System.out.println(num2 + "is less than" + num1);
        }
        else{
            System.out.println(num1 + "is less than" +num2);
        }
    }
}

