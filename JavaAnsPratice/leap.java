import java.util.*;
public class leap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the year=");
        int year=sc.nextInt();
        if(year%4==0 && year%100!=0 || year%400==0){
            System.out.println("this is a leap year");
        }
        else{
            System.out.println("this year not a leap year");
        }
    }
}

