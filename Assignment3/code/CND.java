package Assignment3;

public class CND {
    public static void main(String[] args) {
        int num = 1;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
              System.out.print(num +" ");
              num++;


            }
            System.out.println();
        }
        int n=num;
       for(int i=3;i>=1;i--){
            for(int j=1;j<=3-i;j++){
                System.out.print(" ");
            }
           for(int p=1;p<=i;p++){
                System.out.print(n +" ");
                n++;
           }
            System.out.println();
       }
   }
}


