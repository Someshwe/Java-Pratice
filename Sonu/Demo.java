import java.util.*;
public class Demo{
   public static void main(String [] args){
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter the number1=");
      double num1=sc.nextDouble();
      System.out.println("Enter the number2=");
      double num2=sc.nextDouble();
      double add=num1+num2;
      double sub=num1-num2;
      double mul=num1*num2;
      double divi=num1/num2;
      double mod=num1%num2;
      System.out.println("The addition of two no.="+add);
      System.out.println("The subtraction of two no.="+sub);
      System.out.println("The multiplication of two no.="+mul);
      System.out.println("The division of two no.="+divi);
      System.out.println("The modulation of two no.="+mod);
   }
}                