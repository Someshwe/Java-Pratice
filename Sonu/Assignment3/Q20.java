import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        int amount = scanner.nextInt();
        int fivehundred=0,hundred=0,fifty=0,twenty=0,ten=0,five=0,two=0,one=0;
        if(500<=amount){
            fivehundred=amount/500;
            amount=amount%500;
        }
        if(100<=amount){
            hundred=amount/100;
            amount=amount%100;
        }
        if(50<=amount){
            fifty=amount/50;
            amount=amount%50;
        }
        if(20<=amount){
            twenty=amount/20;
            amount=amount%20;
        }
        if(10<=amount){
            ten=amount/10;
            amount=amount%10;
        }
        if(5<=amount){
            five=amount/5;
            amount=amount%5;
        }
        if(2<=amount){
            two=amount/2;
            amount=amount%2;
        }
        if(1<=amount){
            fivehundred=amount/1;
            amount=amount%1;
            
        }
        System.out.println("ALL NOTES");
        System.out.println("fivehundred rupees="+fivehundred);
        System.out.println("hundred rupees="+hundred);
        System.out.println("fifty rupees="+fifty);
        System.out.println("Twenty rupees="+twenty);
        System.out.println("ten rupees="+ten);
        System.out.println("five rupees="+five);
        System.out.println("two rupees="+two);
        System.out.println("one rupees="+one);
    }
}