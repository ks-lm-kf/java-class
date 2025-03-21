package demo1;

public class StudentTest {
    public static void main(String[] args){
        Student s1=new Student();
        s1.setAge(20);
        s1.setName("nihao");
        int age = s1.getAge();
        String name = s1.getName();
        Student s2=new Student("lili",20);

        System.out.println(""+age);
        System.out.println(""+name);
        System.out.println(""+s2.getAge());
        System.out.println(""+s2.getName());

    }
}
