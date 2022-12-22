package methodexs;
import java.util.Scanner;
public class x6sumofdigits {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the number:");
        int num = obj.nextInt();
        System.out.println("sum of value is"+" " + sum(num));
    }

    static int sum(int num) {
        int sum = 0;
        for (int i = 0; i < num; i++) {
          sum=sum+num%10;
          num=num/10;

        }

        return sum;
    }
}