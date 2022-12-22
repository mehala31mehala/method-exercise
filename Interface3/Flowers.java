package Interface3;

interface Flower1{
    public void Flowers(String name,String color );
}interface Flower2{
    public void Method(String name,String color);
}interface Flower3{
    public void Other(String name,String color);
}interface Flower4{
    public void Next(String name,String color);
}
class Flowers implements Flower1,Flower2,Flower3,Flower4{
    public void Flowers(String name,String color){
        System.out.println("Flower name:"+name);
        System.out.println("Color:"+color+"\n");
    }
    public void Method(String name,String color){
        System.out.println("Name:"+name);
        System.out.println("Color:"+color+"\n");
    }
    public void Other(String name,String color){
        System.out.println("Name:"+name);
        System.out.println("Color:"+color+"\n");
    }
    public void Next(String name,String color){
        System.out.println("Name;"+name);
        System.out.println("Color:"+color);
    }
}
