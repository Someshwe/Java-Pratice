import java.util.*;
class A{
    A(){
        System.out.println("1-50 even numbers are=");
        for(int i=1;i<=50;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
class B extends A{
    B(){
        System.out.println("1-50 natural number are=");
        for(int i=1;i<=50;i++){
            System.out.println(i);
        } 
    }
}
class EvenNat{
    public static void main(String[] args) {
        B ob=new B();
    }
}