import java.util.*;
public class Q16{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Eneter the character=");
        char c=sc.next().charAt(0);
        if((c>='a'&& c<='z')||(c>='A'&&c<='Z')){
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u' && c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
                System.out.println("Alphabate is vowel");
            }
            else{
             System.out.println("Alphabate is constant");
            }
        }
            else{
            System.out.println("Alphabate is constant");
        }
    }
}