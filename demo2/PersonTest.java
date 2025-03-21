package demo2;

public class PersonTest {
    public static void main(String[] args){
        Student s=new Student();
        s.eat();
        System.out.println(""+s.name);
    }
}
class Person{
    String name="fuck";
    public void eat(){
        System.out.println("eat");
    }

}
class Student extends Person{
    String name="Student1";
    public void show(){
        String name ="var";
        System.out.println(""+name);
        System.out.println(""+this.name); //访问子类   
        System.out.println(""+super.name);//访问父类
    }
}
