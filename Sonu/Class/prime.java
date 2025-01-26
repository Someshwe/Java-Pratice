import java.util.*;

class A{
    int a;
    void value(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number=");
        a=sc.nextInt();
        cal();
    }
    void cal(){
        if(a<=1){
            System.out.println("this is not a prime number");
        }
        else{
            for(int i=2;i<=a/2;i++){
                if(a%i==0){
                    System.out.println("Not a prime number");
                    break;
                }
                else if(i==a/2){
                    System.out.println("Prime number");
                }
            }
        }
    }
}
class prime{
    public static void main(String[] args) {
        A ob=new A();
        ob.value();
    }
}