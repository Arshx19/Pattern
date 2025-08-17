import java.util.Scanner;

public class w19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row=1;
        int star=1;
        int space=n+1;
        while(row<=n){
            int val=1;
            int i=1;
            while(i<=star){
                System.out.print(val+"\t");
                i++;
                val++;
            }
            int j=1;
            while(j<=space){
                System.out.print("\t");
                j++;
            }
            
            int k=star;
            if (row==n) {
                k--;
            }
            while(k>=1){
                System.out.print(k+"\t");
                k--;
                
            }
            row++;
            star++;
            space-=2;
            System.out.println();
        }
    }
    }
