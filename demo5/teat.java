package demo5;

public class teat {
    public static void main(String[] args){
        Student s1=new Student();
        s1.setName("nihao");
        s1.setAge(22);
        s1.study();
        s1.show();
        Student s2=new Student();
        s2.setName("sili");
        s2.setAge(228);
        s2.study();
        s2.show();
    }
}
class Student{
    private String name;
    private int age;
    static String tName;
    public Student(){
        super();
    }
    public void study() {
        throw new UnsupportedOperationException("Unimplemented method 'study'");
    }
    public void show() {
        throw new UnsupportedOperationException("Unimplemented method 'show'");
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
}
