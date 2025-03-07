import java.util.Scanner;
public class ketang3_7_1{
    public static void main(String[] age){
        /*
         * 输入个人信息并输出
         * 1导包：import class.util.Scanner
         * 2实例化对象：Scanner sc=new Scanner（System.in）
         * 3调用方法：sc.next() sc.nextInt() sc.nextDouble()
         */
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        int year=sc.nextInt();
        String nv=sc.next();
        double high=sc.nextDouble();
        String yn=sc.next();
        System.out.println("name="+name);
        System.out.println("year="+year);
        System.out.println("nannv="+nv);
        System.out.println("high="+high+"\t"+yn);
        sc.close();
//ln代表换行printfln括号内引号外\t表示空格；
    }
}
