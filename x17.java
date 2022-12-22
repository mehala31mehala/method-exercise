package methodexs;
import java.util.Scanner;
public class x17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input a number:");
        int num = input.nextInt();
        if (num > 0) {
            System.out.println(test(num));
        }
    }
    static int test(int num){
        int count=0;
       for(int i=0;i<num;i++){
       if(num%10==2){
        count++;
       }
       num/=10;
       }
       return count;
    }
}
