import java.util.*;
class info{
    String name;
    int Regd_no;
    String Branch;
    String gender;
    long D_o_b;
    long Phone_no;
    info( String name,
    int Regd_no,
    String Branch,
    String gender,
    long D_o_b,
    long Phone_no){
        System.out.println("Name="+name);
        System.out.println("Regd_no="+Regd_no);
        System.out.println("Branch="+Branch);
        System.out.println("Gender="+gender);
        System.out.println("D_O_B="+D_o_b);
        System.out.println("Phone_no="+Phone_no);
    } 
}
public class Databasepc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Name=");
        String Name=sc.nextLine();
        System.out.print("Enter the Regd_no=");
        int regd=sc.nextInt();
        System.out.print("Enter the Branch=");
        String branch=sc.next();
        System.out.print("Enter the Gender=");
        String Gender=sc.next();
        System.out.print("Enter the D_O_B=");
        long dob=sc.nextLong();
        System.out.print("Enter the Phone_no=");
        long ph=sc.nextLong();
        info ob=new info(Name, regd, branch, Gender, dob, ph);
    }
}
