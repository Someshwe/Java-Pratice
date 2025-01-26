import java.util.*;
public class ArrayLeetcode {
    public static void main() {
        Scanner sc=new Scanner(System.in);
        int target=9;
        int[] a={2,3,5,4,5};
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]+a[j]==target){
                    int[] num={i,j};
                    return num;
                }
            }
        }
        return null;
    }
}
