import java.util.*;
public class Q27{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter electricity unit=");
        double u=sc.nextDouble();
        double bill=0;
        if(50>=u){
            bill=50*0.50;
        }
        else if(150>=u){
            bill=50*0.50+(u-50)*0.75;
        }
        else if(250>=u){
            bill=50*0.50+(100*0.75)+(u-150)*1.20;
        }
        else{
            bill=50*0.50+(100*0.75)+(150*1.20)+((u-250)*1.50);
        }
        bill=bill*1.2;
        System.out.println("Your electricity bill="+bill);
    }
}