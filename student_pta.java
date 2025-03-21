import java.util.Scanner;
public class student_pta {

    
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            String name=sc.next();
            int age=sc.nextInt();
            String sex=sc.next();
            Student s=new Student(name,sex,age);
            System.out.print(s);
        sc.close();
        
}
}
class Student{
    private String name;
    private String sex;
    private int age;
    public Student(){

    }
    public Student(String name,String sex,int age){
        this.name=name;
        this.sex=sex;
        this.age=age;
    }
    public void setName(String name){
        this.name=name;
    }
    public String toString(){
        return "Student [name='"+name+"', sex='"+sex+"', age="+age+"]";
    }
}

