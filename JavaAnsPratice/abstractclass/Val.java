import java.util.*;
interface One{
    void palindrome();
    void armstrong();
    Scanner sc=new Scanner(System.in);
}
class Result implements One{
    int num,r,sum=0,temp;
    public void palindrome(){
    System.out.print("Enter the number=");
    num=sc.nextInt();
    temp=num;
    while(num>0){
        r=num%10;
        sum=(sum*10)+r;
        num=num/10;
    }
    if(temp==sum){
        System.out.println("Number is palindrome");
    }
    else{
        System.out.println("Number is not palindrome");
    }
}
public void armstrong(){
    palindrome();
    int temp, digits=0, last=0, sum=0,n; 
    System.out.print("Enter the number=");
    n=sc.nextInt();
    temp=n;   
while(temp>0)    
{   
temp = temp/10;   
digits++;   
}   
temp = n;   
while(temp>0)   
{     
last = temp % 10;   
sum +=  (Math.pow(last, digits));    
temp = temp/10;   
}  
if(n==sum)   
{
System.out.println(n+"is a armstrong number");
}
else{
System.out.println(n+"is not a armstrong number");
}
}   
}
public class Val{
public static void main(String [] args){
Result ob=new Result();
ob.armstrong();
}
}