package methodexs;
import java.util.Scanner;
public class x13area_of_triangle {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the sides of the triangle:");
        int side1=input.nextInt();
        int side2=input.nextInt();
        int side3=input.nextInt();
        System.out.println("Area of the triangle is\n"+area(side1,side2,side3));
        System.out.println("perimeter of the triangle:"+perimeter(side1,side2,side3));

    }
    static double area(double side1,double side2,double side3){
       double area=0;
        double s=(side1+side2+side3)/2;
        area=Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        return area;

    }
    static int  perimeter(int side1,int side2,int side3){
        return (side1+side2+side3);
    }

}
