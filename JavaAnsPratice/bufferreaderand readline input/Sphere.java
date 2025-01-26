import java.io.*;
class Sphere{
    public static void main(String[] args)throws IOException {
        double r,volum;
        InputStreamReader str=new InputStreamReader(System.in);
        BufferedReader ob=new BufferedReader(str);
        System.out.print("Enter the radius=");
        r=Double.parseDouble(ob.readLine());
        volum=(double)4/3*(Math.PI*(r*r*r));
        System.out.println("Volum of a Sphere is="+volum);
    }
}