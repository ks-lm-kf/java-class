package demo4;

public class PolyMorphicTest {
    public static void main(String[] age){
        Animal2 b= new Animal2();
        b.eat();
        Animal2 a= new Dog2();
        a.eat();
        if(a instanceof Dog2){
            Dog2 d=new Dog2();
            d.bark();
        }
    }
}
class Animal2{
    public void eat(){
        System.out.println("cccccc");
    }
}
class Dog2 extends Animal2{
    public void eat(){
        System.out.println("ccb");
    }
    public void bark(){
        System.out.println("nm");
    }
}