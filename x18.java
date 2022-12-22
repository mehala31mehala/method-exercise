package methodexs;
import java.util.Scanner;
public class x18 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the numbers:");
        int n1= input.nextInt();
        int n2= input.nextInt();
        int n3= input.nextInt();
        System.out.println("check the numbers are consecutive or not! "+test(n1,n2,n3));
        }
        static boolean test(int n1,int n2,int n3){
        int max=Math.max(n1,Math.max(n2,n3));
        int min=Math.min(n1,Math.min(n2,n3));
        int middle=(n1+n2+n3)-max-min;
        return(max-middle==1)&&(middle-min==1);
    }
}
