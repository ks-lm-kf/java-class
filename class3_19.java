public class class3_19{
    /*定义变量
     * 类名 对象名=new 类名（）；
     */
    public static void main(String[] args){
        Student s1=new Student();
        Phone s2=new Phone();
        s1.study();
        s1.eat();
        s2.call();
        s2.playGame();
        s1.setName("张三");
        s2.setBrand("不知道");
        String name=s1.getName();
        String brand=s2.getBrand();
        System.out.println(""+brand);
        System.out.println(""+name);
        s1.setAge(60);
        s2.setPrice(600.0);
        System.out.println(""+s2.getPrice());
        int age=s1.getAge();
        System.out.println(""+age);
    }
    
}