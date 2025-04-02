package demo7;

public class Parent {
    static{
        System.out.println("静态");
    }
    {
        System.out.println("非静态");
    }
}
