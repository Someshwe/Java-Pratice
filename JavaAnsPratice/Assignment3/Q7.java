import java.util.*;
public class Q7 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter your height=");
      double h=sc.nextDouble();
      System.out.print("Enter your weight="); 
      double w=sc.nextDouble();
      if(h>=160)
      {
        if(w>=65)
        {
            System.out.println("you are eligibil for NCC candidate");
        }
        else{
            System.out.println("!Sorry, You are not eligibl for NCC candidate for your weight is less than 65kg");
        }
      }
      else{
        System.out.println("!Sorry, You are not eligibl for NCC candidate for your height is less than 160");
      }
    }
}