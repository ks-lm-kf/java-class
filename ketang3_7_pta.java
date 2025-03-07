import java.util.Scanner;
public class ketang3_7_pta{
    public static void main(String[] age){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=a+b+c;
        int e=a*b*c;
        double f=(a+b+c)/3.0;
        System.out.printf("%d %d %.2f\n",d,e,f);
    }
}