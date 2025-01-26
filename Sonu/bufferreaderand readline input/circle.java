import java.io.*;
class circle{
    public static void main(String[] args)throws IOException {
        double r,area;
        InputStreamReader str=new InputStreamReader(System.in);
        BufferedReader ob=new BufferedReader(str);
        System.out.print("Enter the radius=");
        r=Double.parseDouble(ob.readLine());
        area=Math.PI*r*r;
        System.out.println("Area of a circle ="+area);
    }
}