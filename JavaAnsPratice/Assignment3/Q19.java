import java.util.*;
public class Q19{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Eneter the Week number=");
        int n=sc.nextInt();
        if(n==1){
            System.out.println("Monday");
        }
        else if(n==2){
            System.out.println("Tuseday");
        }
        else if(n==3){
            System.out.println("Wednesday");
        }
        else if(n==4){
            System.out.println("Thurseday");
        }
        else if(n==5){
            System.out.println("Friday");
        }
        else if(n==6){
            System.out.println("Saturday");
        }
        else if(n==7){
            System.out.println("Sunday");
        }
        else{
            System.out.println("Invalid input");
        }
    }
}
