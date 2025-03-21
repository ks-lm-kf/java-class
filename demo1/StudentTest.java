package demo1;

public class StudentTest {
    public void main(String[] args){
        Student1 s1=new Student1();
        int age = s1.getAge();
        String name = s1.getName();
        Student1 s2=new Student1("lili",20);
        System.out.println(""+age);
        System.out.println(""+name);
        System.out.println(""+s2.getAge());
        System.out.println(""+s2.getName());

    }
}
