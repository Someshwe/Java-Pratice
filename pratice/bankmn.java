import java.io.*;
public class bankmn {
    public static void main(String[] args) throws IOException 
    {
        InputStreamReader ob=new InputStreamReader(System.in);
        BufferedReader str=new BufferedReader(ob);
        System.out.print("Enter the amount=");
        int amount=Integer.parseInt(str.readLine());
        int fivehundred=0,hundred=0,fifty=0,twenty=0,ten=0,five=0,two=0,One=0;
        if(amount>=500){
            fivehundred=amount/500;
            amount=amount%500;
        }
        if(amount>=100){
            hundred=amount/100;
            amount=amount%100;
        }
        if(amount>=50){
            fifty=amount/50;
            amount=amount%50;
        }
        if(amount>=20){
            twenty=amount/20;
            amount=amount%20;
        }
        if(amount>=10){
            ten=amount/10;
            amount=amount%10;
        }
        if(amount>=5){
            five=amount/5;
            amount=amount%5;
        }
        if(amount>=2){
            two=amount/2;
            amount=amount%2;
        }
        if(amount>=1){
            One=amount/1;
            amount=amount%1;
        }
        System.out.println("500="+fivehundred);
        System.out.println("100="+hundred);
        System.out.println("50="+fifty);
        System.out.println("20="+twenty);
        System.out.println("10="+ten);
        System.out.println("5="+five);
        System.out.println("2="+two);
        System.out.println("1="+One);
    }
}
