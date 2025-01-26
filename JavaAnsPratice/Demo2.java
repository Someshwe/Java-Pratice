import java.util.Scanner;
import java.lang.System;
public class Demo2{
   public static void main(String [] args){
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter the first no=");
      double num1=sc.nextDouble();
      System.out.print("Enter the Second no=");
      double num2=sc.nextDouble();
      System.out.println("Enter your choice to perform operation=");
      System.out.println("1. Addition");
      System.out.println("2. Subtraction");
      System.out.println("3. Multiplication");
      System.out.println("4. Division");
      System.out.println("5. Modul");
      System.out.println("6. exit");
      int ch=sc.nextInt();
      switch (ch){
         case 1: System.out.print("The sum of Two no is="+(num1+num2));
                 break;
         case 2: System.out.print("The sub of  no is="+(num1-num2));
                 break;
         case 3: System.out.print("The mul of Two no is="+(num1*num2));
                 break;
         case 4: System.out.print("The divi of Two no is="+(num1/num2));
                 break;
         case 5: if(num2!=0){
                   System.out.print("The module of Two no is="+(num1%num2));
                 }
                 else{
                   System.out.print("zero cann't be devided in to any num");
                 } 
                 break;
         case 6: System.out.print("exit from the operation");
                 break;
         default : break;
      }
   }
}                