import java.util.*;
public class Fact2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number=");
        int n=sc.nextInt();
        int c=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println(i);
                c++;
            }
        }
        System.out.println(c);
    }
}