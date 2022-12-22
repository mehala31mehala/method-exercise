package methodexs;
import java.util.Scanner;
public class x5countall {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the sTRING:");
        String line=obj.nextLine();
        System.out.println("length of the string:"+countwords(line));
    }
    static int countwords(String line){
        int count=1;
        for(int i=0;i<line.length();i++){
        if(line.charAt(i)==' '){
                count++;
        }
        }
        return count;
    }
}
