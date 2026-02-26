package Assignment3;

public class BinaryD {
    public static void main(String[] args){
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                int num=i+k;
                if(num%2==0){
                    System.out.print(1 +" ");
                }else{
                    System.out.print(0 +" ");
                }




            }
            System.out.println();
        }

        for (int i = 3; i >=1; i--) {
            for (int j = 1; j <= 3+1 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                int num=i+k;
                if(num%2==0){
                    System.out.print(1 +" ");
                }else{
                    System.out.print(0 +" ");
                }




            }
            System.out.println();
        }
    }
}
