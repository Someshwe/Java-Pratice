import java.util.*;
abstract class abs1 {
    abstract void area();
    abstract void peri();
    Scanner sc = new Scanner(System.in);
}
class sqr extends abs1 {
    int a, area, peri;
    public void area() {
        System.out.print("Enter the side=");
        a = sc.nextInt();
        area = a * a;
        System.out.println("Area of a Square=" + area);
        peri();
    }
    public void peri() {
        peri = 4 * a;

        System.out.println("Perimeter  of a Square=" + peri);
    }
}
class rect extends abs1 {
    int l, b, area, peri;
    public void area() {
        System.out.print("Enter the length =");
        l = sc.nextInt();
        System.out.print("Enter the bredth =");
        b = sc.nextInt();
        area = l * b;
        System.out.println("Area of a Rectangle=" + area);
        peri();
    }
    public void peri() {
        peri = 2 * (l + b);

        System.out.println("Perimeter  of aRectangle=" + peri);
    }
}
public class arper {
    public static void main(String[] args) {
        rect ob1 = new rect();
        sqr ob2 = new sqr();
        ob1.area();
        ob2.area();
    }
}