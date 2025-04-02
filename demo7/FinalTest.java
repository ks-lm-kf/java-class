package demo7;

public class FinalTest {
    public static void main(String[] args) {
        int a = 10;
        a=20;
        final int b = 100;
//final修饰变量为常量，不能改变；
System.out.println(""+a+b);
    }
}
//final方法不能被重写,不能被继承;
class A{
    public final void show(){

    }
    //class B extends A{
    //    public void show(){

    //    }
    // }
}
