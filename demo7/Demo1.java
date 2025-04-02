package demo7;
public class Demo1{
    static{
        System.out.println("静态");
    }
    {
        System.out.println("非静态");
    }
    public Demo1(){
        System.out.println("构造方法");
    }
    public static void main(String[] args){
        Demo1 demo1=new Demo1();
        Demo1 demo2=new Demo1();
        System.out.println(""+demo1);
        System.out.println(""+demo2);
    }
}