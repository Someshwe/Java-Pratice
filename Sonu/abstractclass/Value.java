import java.util.*;
abstract class check{
abstract void palindrome();
abstract void armstrong();
Scanner sc=new Scanner(System.in);
}
class Result extends check{
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
System.out.print("Number is palindrome");
}
else{
System.out.print("Number is not palindrome");
armstrong();
}
}
public void armstrong(){
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
System.out.print(n+"is a armstrong number");
}
else{
System.out.print(n+"is not a armstrong number");
}
}   
}
public class Value{
public static void main(String [] args){
Result ob=new Result();
ob.palindrome();
}
}