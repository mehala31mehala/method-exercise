package methodexs;
import java.util.Scanner;
import java.lang.String;
public class x12n_by_nmatrix {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.print("enter the number:");
        int num=obj.nextInt();
        printmatrix(num);
    }
   public static void  printmatrix(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print((int) (Math.random() * 2) + " " );
            }
            System.out.println();
        }

    }
}
