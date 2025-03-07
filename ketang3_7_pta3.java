import java.util.Scanner;
public class ketang3_7_pta3{
    public static void main(String[] age){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int c=0;
        if(a<=0){
            c=0;
        }
        else if(a>0&&a<=120){
            c=20*a;
        }
        else if(a>120){
            c=2400+2*20*(a-120);
        }
        System.out.println(""+c);
        sc.close();
    }
}