import java.util.*;
public class Vocc{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the character=");
        char ch=sc.next().charAt(0);

        switch (ch) {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Character is vowel");
                break;
        
            default:
                if(ch>='A' && ch<='Z' || ch>='a' && ch<='z'){
                    System.out.println("The character is constant");
                }
                else{
                    System.out.println("Invalid input");
                }
        }
        System.out.println("Maximum number of two number is="+max);
    }
}