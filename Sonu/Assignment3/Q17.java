import java.util.*;
public class Q17{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Eneter the character=");
        char c=sc.next().charAt(0);
        if((c>='a'&& c<='z')||(c>='A'&&c<='Z')){
            System.out.println("The character is Alphabate");
        }
        else if(c>=48 && c<=57){
            System.out.println("The character is digit");
        }
        else{
            System.out.println("The character is special character");
        }
    }
}