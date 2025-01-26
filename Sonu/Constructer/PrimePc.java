import java.util.*;
class value{
    int a;
    value(int aa){
        a=aa;
        calculate();
    }
    void calculate(){
        if(a<=1){
            System.out.println("This is not a prime number");
        }
        else{
            for(int i=2;i<=a/2;i++)
            {
                if(a%i==0)
                {
                    System.out.println("This is not a prime number"); 
                    break;
                }
                else if(i==a/2){
                   System.out.println("This is a prime number");
                }           
            }
        }
    }
}
public class PrimePc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the numer=");
        int av=sc.nextInt();
        value var=new value(av);
    }
}

