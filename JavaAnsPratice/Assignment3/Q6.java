import java.util.*;
public class Q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number=");
        int num=sc.nextInt();
        if(num>90){
            num=num+2;
            System.out.println("Result is="+num);// if the number is greater than the 90 then add 2 and print
        }
        else{
            num=num+5;
            System.out.println("Result is="+num);// if the number is less than the 90 then add 5 and print
        }
    }
}
