import java.util.*;
public class Q15{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Eneter the character=");
        char c=sc.next().charAt(0);
        if((c>='a'&& c<='z')||(c>='A'&&c<='Z')){
            System.out.println("char is a alphabate");
        }
        else{
            System.out.println("Not a alphabate");
        }
    }
}