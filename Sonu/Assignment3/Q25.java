import java.util.*;
public class Q25{
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter Physics mark="); 
       int p=sc.nextInt();
       System.out.print("Enter Chemistry mark="); 
       int c=sc.nextInt();
       System.out.print("Enter Biology mark="); 
       int b=sc.nextInt();
       System.out.print("Enter Mathematics mark="); 
       int m=sc.nextInt();
       System.out.print("Enter Computer mark="); 
       int co=sc.nextInt();
       int score=p+c+b+m+co;
       int to=500;
       float Pe=(float)score/to*100;
       System.out.println("Your Percentage is="+Pe+"%");
       if(Pe>=90){
        System.out.println("Grade A");
       }
       else if(Pe>=80){
        System.out.println("Grade B");
       }
       else if(Pe>=70){
        System.out.println("Grade C");
       }
       else if(Pe>=60){
        System.out.println("Grade D");
       }
       else if(Pe>=40){
        System.out.println("Grade E");
       }
       else{
        System.out.println("Grade F");
       }
    }
}