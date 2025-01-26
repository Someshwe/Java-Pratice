import java.util.*;
public class Q9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the 3 digit number=");
        int n=sc.nextInt();
        int lastDigit=n%10;
        int secondDigit=(n/10)%10;
        int firstDigit=n/100;
        System.out.println("The last digit of three digit number is="+lastDigit);
        System.out.println("The second digit of three digit number is="+secondDigit);
        System.out.println("The first digit of three digit number is="+firstDigit);
    }
}
