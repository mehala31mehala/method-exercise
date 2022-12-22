package methodexs;
import java.util.Scanner;
public class x10leapyr {
    public static void main(String[] args){
   Scanner obj=new Scanner(System.in);
   System.out.println("Enter the year:");
   int year=obj.nextInt();
   System.out.println(leapyear(year));
    }
    static boolean leapyear(int year){
        boolean a=(year%4)==0;
        boolean b=(year%100)!=0;
        boolean c=((year%100==0)&&(year%400==0));
        return a&&(b||c);
    }
}
