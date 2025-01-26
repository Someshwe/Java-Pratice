import java.util.*;
public class paradominumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x,sum=0;
        System.out.print("enter the number=");
        x=sc.nextInt();
        int temp=x;
        while (x>0) {
            int digit=x%10;
            sum=(sum*10)+digit;
            x=x/10;
        }
        if(temp==sum){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}