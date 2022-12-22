package methodexs;
import java.util.Scanner;
public class x8rate {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the invesment amount:");
        double amount = obj.nextDouble();
        System.out.println("enter the  interest:");
        double rate = obj.nextDouble();
        System.out.println("enter the number of years:");
        double year = obj.nextDouble();
        System.out.println("output:" + rate(amount, rate, year));
    }

    static double rate(double amount, double rate, double year) {
            return amount+(amount * rate * year) / 100;

        }
    }
