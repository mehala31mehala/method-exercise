package Fruitex;

public class Fruit {
    public String name;
    public String color;
    public String taste;
    public String type;
    public String origin;
    public void Fruit(String name, String color, String taste, String type, String origin) {
        System.out.println("Fruit name:" + name);
        System.out.println("Fruit color:" + color);
        System.out.println("Taste:" + taste);
        System.out.println("Type:" + type);
        System.out.println("Origin:" + origin);
    }
}
     class Mango extends Fruit {
         private int rate_of_1kg;
         private int vitamin_C;
         private double fat;
         public Mango(int rate_of_1kg,int  vitamin_C,double fat ) {
             this.rate_of_1kg = rate_of_1kg;
             this.vitamin_C=vitamin_C;
             this.fat=fat;
         }


         public int getRate_of_1kg() {
             return rate_of_1kg;
         }

         public void setRate_of_1kg(int rate_of_1kg) {
             this.rate_of_1kg = rate_of_1kg;
         }

         public int getVitamin_C() {
             return vitamin_C;
         }

         public void setVitamin_C(int vitamin_C) {
             this.vitamin_C = vitamin_C;
         }

         public double getFat() {
             return fat;
         }

         public void setFat(double fat) {
             this.fat = fat;
         }

         public static void main(String[] args) {
             Mango Object = new Mango(90,203,1.3);
             Object.Fruit("Mango", "yellow", "Sweet", "Malgova", "Tamilnadu");
             System.out.println("Rate of 1kg mango:" + Object.getRate_of_1kg() + "rs");
             System.out.println("Quantity of vitamin c in 1 mango:" + Object.getVitamin_C() + "%");
             System.out.println("Quantity of fat in 1 mango:" + Object.getFat() + "gram");
             System.out.println();
         }
     }
