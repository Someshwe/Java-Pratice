import java.util.*;
class prime{
    int num;
    prime(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number=");
        num=sc.nextInt();
        process();
    }
    void process(){
        if(num<=1){
            System.out.println("This is not a prime number");
        }
        else{
            for(int i=2;i<=num/2;i++)
            {
                if(num%i==0)
                {
                    System.out.println("This is not a prime number"); 
                    break;
                }
                else if(i==num/2){
                   System.out.println("This is a prime number");
                }           
            }
        }
    }
}
public class PrimeNumConst{
    public static void main(String[] args) {
        prime ob=new prime();
    }
}