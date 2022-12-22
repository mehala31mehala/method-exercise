package methodexs;
import java.util.Scanner;
public class ex1max {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the values:");
        double a=obj.nextDouble();
        double b=obj.nextDouble();
        double c=obj.nextDouble();
        System.out.println("Smallest number is"+smallest(a,b,c));

    }
    static double smallest(double a,double b,double c){
        return Math.min(Math.min(a,b),c);
    }
}

