public class w12 {
    public static void main(String[] args) {
        int n=7;
        int rows=1;
        int star=n/2+1;
        int space=-1;
        while(rows<=n){
            int i=1;
            if(rows==1){
                i=2;
            }
            while(i<=star){
                System.out.print("*\t");
                i++;
            }
            int j=1;
            while(j<=space){
                System.out.print("\t");
                j++;
            }
            int k=1;
            if(rows==n){
                k=2;
            }
            while(k<=star){
                System.out.print("*\t");
                k++;
            }
            if(rows<=n/2){
                star--;
                space+=2;
            }else{
                star++;
                space-=2;
            }
            System.out.println();
            rows++;
        }
    }
}
