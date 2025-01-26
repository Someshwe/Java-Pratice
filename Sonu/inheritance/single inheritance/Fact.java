import java.util.*;
class A{
    int a;
    A(int aa){
        a=aa;
        System.out.println("Facter of a number");
        for(int i=1;i<=a;i++){
            if(a%i==0){
                System.out.println(i);
            }
        }
    }
}
class B extends A{
    int b;
    B(int b1){
        super(b1);
        b=b1;
        int fact=1;
        for(int i=1;i<=b;i++){
            fact=fact*i;
        }
        System.out.println("fcatorial of a number is="+fact);
    }
}
class Fact{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number=");
        int a1=sc.nextInt();
        B ob=new B(a1);
    }
}