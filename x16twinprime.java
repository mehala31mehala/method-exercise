package methodexs;

public class x16twinprime {
    public static void main(String[] args){
        for(int i=2;i<100;i++){
        if(is_prime(i)&&is_prime(i+2)){
        System.out.printf("(%d,%d)\n",i,i+2);
        }
        }
        }
        static boolean is_prime(long n){
        if(n<2)
        return false;
        for(int i=2;i<=n/2;i++){
        if(n%i==0)
        return false;
        }
        return true;
        }
}
