import java.util.*;
public class Q9{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Eneter MATH mark=");
        int math=sc.nextInt();
        System.out.print("Eneter AGR mark=");
        int agr=sc.nextInt();
        System.out.print("Eneter SCIENCE mark=");
        int science=sc.nextInt();
        if(math>=90){
            System.out.println("You are eligible for scholarship");
        }
         else if(agr>=60){
            System.out.println("You are eligible for scholarship");
        }
        else if(science>=75 && math>=75){
            System.out.println("You are eligible for scholarship"); 
        }
        else{
            System.out.println("you are not eligaible for scholarship because agr marks");
        }
    }
}