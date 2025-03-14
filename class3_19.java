public class class3_19{
    /*定义变量
     * 类名 对象名=new 类名（）；
     */
    public static void main(String[] args){
        Student s1=new Student();
        Phone s2=new Phone();
        s1.study();
        s1.eat();
        s1.setName("张三");
        String name=s1.getName();
        System.out.println(""+name);
        s1.setAge(60);
        int age1=s1.getAge();
        System.out.println(""+age1);
    }
    
}