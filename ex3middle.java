package methodexs;
import java.util.Scanner;
import java.lang.String;
public class ex3middle {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number:");
        String num= input.nextLine();
        System.out.println("Middle number is:"+middle(num));
    }
       static String middle(String num){
        int position;
        int length;
        if(num.length()%2==0){
        position=num.length()/2-1;
        length=2;
       }else{
        position=num.length()/2;
        length=1;
        }
        return num.substring(position,position+length);

        }
}
