import java.util.*;
class MatMul{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the row of array=");
        int n=sc.nextInt();
        System.out.print("Enter the column of array=");
        int m=sc.nextInt();
        int[][] a=new int[n][m];
        int[][] b=new int[m][n];
        int[][] mul=new int[n][n];
        System.out.print("Enter the First array elements=\n");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.print("Enter the Second array elements=\n");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                b[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;i++){
                mul[i][j]=0;
                for(int k=0;k<m;k++){
                    mul[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(mul[i][j]+" ");
            }
            System.out.println();
        } 
    }
}