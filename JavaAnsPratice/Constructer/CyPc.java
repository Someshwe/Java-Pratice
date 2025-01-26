/*Area of a cylindr
 * in using parameterized constructer
 */
import java.util.*;
class Value{
    double radius;
    double height; 
    Value(double r,double h){     //constructer declaration
        radius=r;                 //radius value store and same as the r value
        height=h;                 //height value store and same as the h value
        Calculate();                 //call the calclate method
    }
    double Calculate(){
        double Area=(double)(2*Math.PI*radius*height)+(2*Math.PI*radius*radius);
        System.out.println("Area of a cylinder is="+Area);
        return (Area);
    }
}

public class CyPc{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius=");         
        double ra=sc.nextDouble();                         //give the input for radius or r variable
        System.out.print("Enter the height=");
        double he=sc.nextDouble();                        //give the input for height or h variable
        Value var=new Value(ra, he);
    }
}
