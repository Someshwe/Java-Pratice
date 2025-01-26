import java.util.*;
public class Loop2{
    public static void main(String[] args) {
        int i,a=1;
        for(i=0;i<=5;i++){
            System.out.println(a);
            if(i==0){
                a=a+3;
            }
            else if(i==1){
                a=a+5;
            }
            else if(i==2){
                a=a+7;
            }
            else if(i==3){
                a=a+9;
            }
            else{
                a=a+11;
            }
        }
    }
}