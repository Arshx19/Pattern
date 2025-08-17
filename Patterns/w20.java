import java.util.Scanner;

public class w20 {
    public static void main(String args[]){
        //pattern magic
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int rows= 1;
        int star=n;
        int space=-1;
        while(rows<=2*n-1){
            int i=1;
            while(i<=star){
                System.out.print("* ");
                i++;
            }
            int j=1;
            while(j<=space){
                System.out.print( "  ");
                j++;
            }
            int k=1;
            if(rows==n){
                k=1;
            }
            if(rows==1){
                k=2;
            }
            if(rows==2*n-1){
                k=2;
            }
            while(k<=star){
                System.out.print("* ");
                k++;
            }
            if(rows<n){
                star--;
                space+=2;
            }
            else{
                star++;
                space-=2;
            }
            rows++;
            System.out.println();
        }
    }
}
