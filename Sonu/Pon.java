import java.util.*;
public class Pon{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number=");
        int num=sc.nextInt(); 
        switch (num>0? 1:2) {
            case 1:
                System.out.println("number is positive");
                break;
        
            case 2:
                if(num==0){
                    System.out.println("number is zero");
                }
                else{
                    System.out.println("number is negative");
                }
                break;
        }
    }
}