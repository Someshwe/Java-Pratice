import java.util.*;
class Value{
    int a,b,c;
    void val(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first value=");
        a=sc.nextInt();
        System.out.print("Enter the second value=");
        b=sc.nextInt();
        mark();
        per();
    }
    int mark(){
        c=a+b;
        System.out.println("Total mark is="+c);
        return (c);
    }
    void per(){
        double percentage=(double)c/200*100;
        System.out.println("Percentageof your mark="+percentage+"%");
        if(percentage>=90){
            System.out.println("Grade A");
        }
        else if(percentage>=80){
            System.out.println("Grade B");
        }
        else if(percentage>=70){
            System.out.println("Grade C");
        }
        else if(percentage>=60){
            System.out.println("Grade D");
        }
        else if(percentage>=40){
            System.out.println("Grade E");
        }
        else{
            System.out.println("Fail");
        }
    }
}
class Mark{
    public static void main(String[] args) {
        Value ob=new Value();
        ob.val();
    }
}