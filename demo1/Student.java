package demo1;
public class Student{
    private String name;
    private int age;
    //定义无参构造方法
    public Student(){

    }
    public Student(String name,int age){
        this.age=age;
        this.name=name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
}