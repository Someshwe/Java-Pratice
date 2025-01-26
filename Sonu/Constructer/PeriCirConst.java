import java.util.*;
class Peri{
    double r;
    Peri(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius of a circle=");
        r=sc.nextDouble(); 
        Value();
    }
    double Value(){
        double pe=(double)2*Math.PI*r;
        System.out.println("The perimeter of a circle is="+pe);
        return (pe);
    }
}
public class PeriCirConst{
    public static void main(String[] args) {
        Peri ob=new Peri();
    }
}
