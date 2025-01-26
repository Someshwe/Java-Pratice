import java.util.*;
class Sumarr{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int sum=0,i;
        System.out.print("Enter the size of array=");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the array elements=");
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Array elements are=");
        for(i=0;i<n;i++){
            System.out.print(arr[i]+"\t");
            sum+=arr[i];
        }
        System.out.println("\nSum of all array elements="+sum);
    }
}