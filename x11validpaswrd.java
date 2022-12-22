package methodexs;
import java.util.Scanner;
public class x11validpaswrd {
   public static final int length=8;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1. A password must have at least eight characters.\n" +
                           "2. A password consists of only letters and digits.\n" +
                           "3. A password must contain at least\n" +
                            "Input a password (You are agreeing to the above Terms and Conditions.):");
        String m = input.nextLine();
        if (is_valid_password(m)) {
            System.out.println("Password is valid:" + m);
        } else {
            System.out.println("Not a valid password" + m);
        }
    }
        static boolean is_valid_password(String pass) {
            if (pass.length() < length)
                return false;
            int charcount = 0;
            int numcount = 0;
            for (int i = 0; i < pass.length(); i++) {
            char ch = pass.charAt(i);
             if (is_numeric(ch))
                    numcount++;
             if (is_letter(ch))
                    charcount++;
             else
                    return false;
            }
            return (charcount >= 2 && numcount >= 2);
        }
    public static boolean is_letter(char ch){
        ch=Character.toUpperCase(ch);
        return (ch>='A'&&ch<='Z');
    }
           public static boolean is_numeric(char ch){
                return (ch>='0'&&ch<='9');
        }






}

