package demo1;
public class Student1{
    private String name;
    private int age;
    //定义无参构造方法
    public Student1(){

    }
    public Student1(String name,int age){
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