import java.util.*;
public class Q18{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Eneter the character=");
        char c=sc.next().charAt(0);
        if(c>='A'&& c<='Z'){
            System.out.println("Alphabate is UpperCase");
        }
        else{
            System.out.println("Alphabate is LowerCase");
        }
    }
}