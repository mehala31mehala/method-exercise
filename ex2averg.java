package methodexs;
import java.util.Scanner;
public class ex2averg {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the values:");
        double num1=input.nextDouble();
        double num2=input.nextDouble();
        double num3=input.nextDouble();
        System.out.println("Average of three values:"+Average(num1,num2,num3));

    }
    static double Average(double num1,double num2,double num3){
        return ((num1+num2+num3)/3);
    }
}
