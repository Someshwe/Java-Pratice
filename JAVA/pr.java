import java.util.*;

public class pr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Do you want to start the calculator(yes=1 , no=0)?=");
        int ch=sc.nextInt();
        while(ch==1){
            System.out.print("Enter the First number=");
            int num1 = sc.nextInt();
            System.out.print("Enter the Second number=");
            int num2 = sc.nextInt();
            System.out.println("+. Addition");
            System.out.println("-. Substraction");
            System.out.println("*. Multiplication");
            System.out.println("/. Division");
            char choice = sc.next().charAt(0);
            switch (choice) {
                case '+':
                    System.out.println("The sum of two number is=" + num1 + num2);
                    break;
                case '-':
                    System.out.println("The sub of two number is=" + (num1 - num2));
                    break;
                case '*':
                    System.out.println("The mul of two number is=" + num1 * num2);
                    break;
                case '/':
                    if (num2 > num1) {
                        System.out.println("2nd number does not greater then the 1st number");
                    } else {
                        System.out.println("The div of two number is=" + num1 / num2);
                        System.out.println("The modulus of two number is=" + num1 % num2);
                    }
                    break;
                default:
                    System.out.println("Enter the Valid input");
                    break;
            }
            System.out.println("Do you want to stop then input the character or string in the input of number$");
        }
    }
}
