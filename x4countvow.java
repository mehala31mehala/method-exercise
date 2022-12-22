package methodexs;
import java.util.Scanner;
import java.lang.String;
public class x4countvow {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        System.out.println("the name:");
        String name=obj.nextLine();
        System.out.println("count of the vowels:"+vowels(name));
    }
    static int vowels(String name){
        int count=0;
        for(int i=0;i<name.length();i++){
            if(name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u'){
                count++;
            }
        }
        return count;
    }
}
