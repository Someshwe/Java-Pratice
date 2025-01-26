import java.util.*;
class Value{
    double r;
    double h;
    void show(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Radius of a cylinder=");
        r=sc.nextDouble();
        System.out.print("Enter the height of a cylinder=");
        h=sc.nextDouble();
        val();
    }
    double val(){
        double surfaceArea=(2*Math.PI*r*h)+(2*Math.PI*r*r);
        System.out.println("Surface area of a cylinder="+surfaceArea);
        return (surfaceArea);
    }
}
class Class1{
    public static void main(String[] args) {
        Value ob=new Value();
        ob.show();
    }
}