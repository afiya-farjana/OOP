package FirstPackage;
import java.util.Scanner;


public class Array2d {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,m,p,q;
        System.out.print("Size of array a: ");
        n = input.nextInt();
        m = input.nextInt();
        int[][] a = new int[n][m];
        
        System.out.println("Matrix a: ");
        for(int row=0; row<n; row++){
            for(int col=0; col<m; col++){
                a[row][col] = input.nextInt();
                System.out.print(a[row][col]+" ");
            }System.out.println();
        }
        
        System.out.print("Size of array b: ");
        p = input.nextInt();
        q = input.nextInt();
        int[][] b = new int[p][q];
        int[][] result = new int[n][q];
        int[][] tran = new int[n][q];
        System.out.println("Matrix b: ");
        for(int row=0; row<p; row++){
            for(int col=0; col<q; col++){
                b[row][col] = input.nextInt();
                System.out.print(b[row][col]+" ");
            }System.out.println();
        }
        
        System.out.println("Multiplication is: ");
        if(m!=p){
            System.out.println("multiplication not possible as col1 != row2");
        }
        else{
            for(int r1=0; r1<n; r1++){
                for(int c2=0; c2<q; c2++){
                    result[r1][c2]=0;
                    for(int k=0; k<m; k++){
                        result[r1][c2] += a[r1][k]*b[k][c2];
                    }
                }
            }
            
            for(int i=0; i<n; i++){
                for(int j=0; j<q; j++){
                   // tran[j][i] = result[i][j];
                    System.out.print(result[i][j]+" ");
                }System.out.println();
            }
        }
        
    }
}
