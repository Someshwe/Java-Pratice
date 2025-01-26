import java.util.*;
class value{
    int a,b,c;
    value(int aax,int bax,int cax){
        a=aax;
        b=bax;
        c=cax;
        calculate();
    }
    void calculate(){
        if(a==b||b==c||c==a){
            System.out.println("This is a isolated triangle");
        }
        else{
            System.out.println("This is notm a isolated triangle");
        }
    }
}
public class IsoTriPc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st side=");
        int av=sc.nextInt();
        System.out.println("Enter the 2nd side=");
        int bv=sc.nextInt();
        System.out.println("Enter the 3rd side=");
        int cv=sc.nextInt();
        value var=new value(av,bv,cv);
    }
}
