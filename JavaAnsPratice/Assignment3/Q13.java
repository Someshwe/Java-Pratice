import java.util.*;
public class Q13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number=");
        int n=sc.nextInt();
        if(n>0){
            System.out.println("Number is positive");
        }
        else if(n==0){
            System.out.println("Number is nither positive nor nagative");
        }
        else{
            System.out.println("Number is nagative");
        }
    }
    
}
